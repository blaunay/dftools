package net.sf.dftools.algorithm.importer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

import net.sf.dftools.algorithm.importer.old.GMLPSDFImporterV1;
import net.sf.dftools.algorithm.model.psdf.PSDFGraph;
import net.sf.dftools.algorithm.model.sdf.SDFGraph;

public class GMLPSDFImporter extends GMLModelParserWrapper<PSDFGraph> {

	private GMLImporter<?, ?, ?> trueImporter;

	/**
	 * COnstructs a new importer for SDF graphs
	 */
	public GMLPSDFImporter() {
		trueImporter = new GMLGenericImporter();
	}

	public SDFGraph parse(File f) throws InvalidModelException,
			FileNotFoundException {
		try {
			return (PSDFGraph) trueImporter.parse(f);
		} catch (Exception e1) {
			trueImporter = new GMLPSDFImporterV1();
			try {
				System.out
						.println("Parsing using generic parser failed, trying specialized parser\n");
				return (PSDFGraph) trueImporter.parse(f);
			} catch (Exception e2) {
				throw new InvalidModelException(
						"Cannot parse file. Parsing failed with exception "
								+ e2.getMessage());
			}
		}
	}

	@Override
	public PSDFGraph parse(InputStream input, String path)
			throws InvalidModelException, FileNotFoundException {
		try {
			return (PSDFGraph) trueImporter.parse(input, path);
		} catch (Exception e1) {
			trueImporter = new GMLPSDFImporterV1();
			try {
				System.out
						.println("Parsing using generic parser failed, trying specialized parser\n");
				return (PSDFGraph) trueImporter.parse(input, path);
			} catch (Exception e2) {
				throw new InvalidModelException(
						"Cannot parse file. Parsing failed with exception "
								+ e2.getMessage());
			}
		}
	}

}