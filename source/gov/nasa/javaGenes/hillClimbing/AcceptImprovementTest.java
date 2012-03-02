//
// Copyright (C) 2005 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA.txt at the top of the distribution
// directory tree for the complete NOSA document.
// 
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
//  Created by Al Globus on Wed Jan 29 2003.
package gov.nasa.javaGenes.hillClimbing;

import junit.framework.TestCase;
import gov.nasa.javaGenes.core.FitnessDouble;

public class AcceptImprovementTest extends TestCase {

public AcceptImprovementTest(String name) {super(name);}

public void testAll() {
    AcceptImprovement a = new AcceptImprovement();
    FitnessDouble worse = new FitnessDouble(3);
    FitnessDouble better = new FitnessDouble(2);
    assertTrue("1", a.accept(better,worse));
    assertTrue("2", !a.accept(better,better));
    assertTrue("3", !a.accept(worse,better));
}
}


