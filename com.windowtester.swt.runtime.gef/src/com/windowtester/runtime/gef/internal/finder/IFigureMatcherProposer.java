/*******************************************************************************
 *  Copyright (c) 2012 Google, Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Google, Inc. - initial API and implementation
 *******************************************************************************/
package com.windowtester.runtime.gef.internal.finder;

import org.eclipse.draw2d.IFigure;

import com.windowtester.runtime.draw2d.internal.finder.IFigureSearchScope;
import com.windowtester.runtime.gef.IFigureMatcher;

public interface IFigureMatcherProposer {

	IFigureMatcher propose(IFigureSearchScope scope, IFigure figure);

}
