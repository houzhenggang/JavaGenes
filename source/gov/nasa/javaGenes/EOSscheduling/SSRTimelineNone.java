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
//  Created by Al Globus on Mon Nov 18 2002.
package gov.nasa.javaGenes.EOSscheduling;

import gov.nasa.alsUtility.Error;
import java.io.PrintWriter;
import gov.nasa.alsUtility.IO;

public class SSRTimelineNone extends SSRTimeline {
public void assertIsValid() {}

public int findEarliest(int start,int end,SchedulingData schedulingData) {
    return start;
}
public int getNumberOfSSRsegments() {return 0;}
public void insertAt(int start, SchedulingData schedulingData) {}
public void printToTsd(String filename) {}
public void insertDumpAt(int time) {}
public boolean fits(int start, SchedulingData schedulingData) {return true;}
}


