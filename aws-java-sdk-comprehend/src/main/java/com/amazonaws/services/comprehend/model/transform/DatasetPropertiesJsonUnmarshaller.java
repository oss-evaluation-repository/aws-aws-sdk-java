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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DatasetProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetPropertiesJsonUnmarshaller implements Unmarshaller<DatasetProperties, JsonUnmarshallerContext> {

    public DatasetProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        DatasetProperties datasetProperties = new DatasetProperties();

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
                if (context.testExpression("DatasetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setDatasetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetS3Uri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setDatasetS3Uri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfDocuments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setNumberOfDocuments(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    datasetProperties.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return datasetProperties;
    }

    private static DatasetPropertiesJsonUnmarshaller instance;

    public static DatasetPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetPropertiesJsonUnmarshaller();
        return instance;
    }
}
