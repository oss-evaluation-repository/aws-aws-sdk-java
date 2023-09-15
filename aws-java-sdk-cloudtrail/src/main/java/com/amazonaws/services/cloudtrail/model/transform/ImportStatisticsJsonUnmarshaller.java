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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportStatistics JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportStatisticsJsonUnmarshaller implements Unmarshaller<ImportStatistics, JsonUnmarshallerContext> {

    public ImportStatistics unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportStatistics importStatistics = new ImportStatistics();

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
                if (context.testExpression("PrefixesFound", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importStatistics.setPrefixesFound(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("PrefixesCompleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importStatistics.setPrefixesCompleted(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FilesCompleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importStatistics.setFilesCompleted(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EventsCompleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importStatistics.setEventsCompleted(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FailedEntries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importStatistics.setFailedEntries(context.getUnmarshaller(Long.class).unmarshall(context));
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

        return importStatistics;
    }

    private static ImportStatisticsJsonUnmarshaller instance;

    public static ImportStatisticsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportStatisticsJsonUnmarshaller();
        return instance;
    }
}
