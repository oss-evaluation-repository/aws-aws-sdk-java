/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.neptunedata.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.neptunedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RDFGraphSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDFGraphSummaryJsonUnmarshaller implements Unmarshaller<RDFGraphSummary, JsonUnmarshallerContext> {

    public RDFGraphSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        RDFGraphSummary rDFGraphSummary = new RDFGraphSummary();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("numDistinctSubjects", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rDFGraphSummary.setNumDistinctSubjects(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numDistinctPredicates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rDFGraphSummary.setNumDistinctPredicates(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numQuads", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rDFGraphSummary.setNumQuads(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numClasses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rDFGraphSummary.setNumClasses(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("classes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rDFGraphSummary.setClasses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("predicates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rDFGraphSummary.setPredicates(new ListUnmarshaller<java.util.Map<String, Long>>(new MapUnmarshaller<String, Long>(context
                            .getUnmarshaller(String.class), context.getUnmarshaller(Long.class)))

                    .unmarshall(context));
                }
                if (context.testExpression("subjectStructures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rDFGraphSummary.setSubjectStructures(new ListUnmarshaller<SubjectStructure>(SubjectStructureJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (token == FIELD_NAME && !knownMember) {
                    context.nextToken();
                    com.amazonaws.transform.UnknownMemberJsonUnmarshaller.getInstance().unmarshall(context);
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rDFGraphSummary;
    }

    private static RDFGraphSummaryJsonUnmarshaller instance;

    public static RDFGraphSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RDFGraphSummaryJsonUnmarshaller();
        return instance;
    }
}
