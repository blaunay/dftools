/*
 * Copyright (c) 2012, Synflow
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
 *   * Neither the name of the IETR/INSA of Rennes nor the names of its
 *     contributors may be used to endorse or promote products derived from this
 *     software without specific prior written permission.
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
package net.sf.dftools.graph.visit;

import java.util.ArrayDeque;
import java.util.Deque;

import net.sf.dftools.graph.Vertex;

/**
 * This class defines common attributes and methods for BFS/DFS.
 * 
 * @author Matthieu Wipliez
 * 
 */
public abstract class Search extends Ordering {

	protected final Deque<Vertex> visitList;

	public Search() {
		visitList = new ArrayDeque<Vertex>();
	}

	/**
	 * Adds the given vertex to the visit list.
	 * 
	 * @param vertex
	 *            a vertex
	 */
	abstract protected void addVertex(Vertex vertex);

	/**
	 * Builds the search starting from the given vertex.
	 * 
	 * @param vertex
	 *            a vertex
	 */
	@Override
	public Void caseVertex(Vertex vertex) {
		addVertex(vertex);

		while (!visitList.isEmpty()) {
			Vertex next = visitList.removeFirst();
			vertices.add(next);

			if (!visited.contains(vertex)) {
				visited.add(vertex);
				for (Vertex succ : next.getSuccessors()) {
					addVertex(succ);
				}
			}
		}

		return null;
	}

}
