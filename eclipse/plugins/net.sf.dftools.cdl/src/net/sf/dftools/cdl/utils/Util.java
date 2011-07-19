/*
 * Copyright (c) 2011, EPFL
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *   * Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 *   * Neither the name of the ECOLE POLYTECHNIQUE FEDERALE DE LAUSANNE nor the  
 *     names of its contributors may be used to endorse or promote products 
 *     derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package net.sf.dftools.cdl.utils;

import net.sf.dftools.cdl.cdl.AstModule;

import org.eclipse.emf.ecore.EObject;


public class Util {

	/**
	 * Returns the qualified name of the given entity as
	 * <code>package + "." + name</code>. If <code>package</code> is
	 * <code>null</code>, only the name is returned.
	 * 
	 * @param entity
	 *            an entity
	 * @return the qualified name of the given entity
	 */
	public static String getQualifiedName(AstModule module) {
		String packageName = module.getPackage();
		String simpleName = module.getName();

		String name = simpleName;
		if (packageName != null) {
			name = packageName + "." + name;
		}

		return name;
	}

	/**
	 * Returns the top-level container in which <code>context</code> occurs.
	 * 
	 * @param context
	 *            an object
	 * @return the top-level container in which <code>context</code> occurs
	 */
	public static EObject getTopLevelContainer(EObject context) {
		EObject cter = context.eContainer();
		if (cter == null) {
			return context;
		} else {
			return getTopLevelContainer(cter);
		}
	}

}
