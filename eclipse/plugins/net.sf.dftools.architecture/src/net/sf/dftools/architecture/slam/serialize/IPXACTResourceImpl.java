/**
 * 
 */
package net.sf.dftools.architecture.slam.serialize;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import net.sf.dftools.architecture.slam.Design;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * Resource implementation used to serialize the System-Level Architecture Model
 * into IP-XACT
 * 
 * @author mpelcat
 */
public class IPXACTResourceImpl extends ResourceImpl {

	  /**
	   * Constructor for XMIResourceImpl.
	   * @param uri
	   */
	  public IPXACTResourceImpl(URI uri)
	  {
	    super(uri);
	  }

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		
		
		IPXACTDesignWriter designWriter = new IPXACTDesignWriter();
		
		Design design = (Design) this.getContents().get(0);
		
		designWriter.write(design, outputStream);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		int i=0;
		System.out.println(i);
	}
	  
	  
}
