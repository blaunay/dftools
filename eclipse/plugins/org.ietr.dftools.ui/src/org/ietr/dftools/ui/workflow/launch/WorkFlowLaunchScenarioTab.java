/*********************************************************
Copyright or � or Copr. IETR/INSA

This software is a computer program whose purpose is to prototype
parallel applications.

This software is governed by the CeCILL-C license under French law and
abiding by the rules of distribution of free software.  You can  use, 
modify and/ or redistribute the software under the terms of the CeCILL-C
license as circulated by CEA, CNRS and INRIA at the following URL
"http://www.cecill.info". 

As a counterpart to the access to the source code and  rights to copy,
modify and redistribute granted by the license, users are provided only
with a limited warranty  and the software's author,  the holder of the
economic rights,  and the successive licensors  have only  limited
liability. 

In this respect, the user's attention is drawn to the risks associated
with loading,  using,  modifying and/or developing or reproducing the
software by the user in light of its specific status of free software,
that may mean  that it is complicated to manipulate,  and  that  also
therefore means  that it is reserved for developers  and  experienced
professionals having in-depth computer knowledge. Users are therefore
encouraged to load and test the software's suitability as regards their
requirements in conditions enabling the security of their systems and/or 
data to be ensured and,  more generally, to use and operate it in the 
same conditions as regards security. 

The fact that you are presently reading this means that you have had
knowledge of the CeCILL-C license and that you accept its terms.
 *********************************************************/

package org.ietr.dftools.ui.workflow.launch;

import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.ietr.dftools.ui.Activator;
import org.ietr.dftools.ui.workflow.ScenarioConfiguration;

/**
 * Launch Tab for scenario options. From this tab, an
 * {@link ScenarioConfiguration} is generated that feeds an
 * {@link ScenarioRetriever} to create the input scenario.
 * 
 * @author mpelcat
 */
public class WorkFlowLaunchScenarioTab extends AbstractWorkFlowLaunchTab {

	@Override
	public void createControl(Composite parent) {

		super.createControl(parent);

		drawFileChooser("Scenario file:",
				ScenarioConfiguration.ATTR_SCENARIO_FILE_NAME);

	}

	@Override
	public String getName() {
		return "Scenario";
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage() {
		Image image = Activator.getImage("icons/workflow.png");

		if (image != null)
			return image;

		return super.getImage();
	}
}