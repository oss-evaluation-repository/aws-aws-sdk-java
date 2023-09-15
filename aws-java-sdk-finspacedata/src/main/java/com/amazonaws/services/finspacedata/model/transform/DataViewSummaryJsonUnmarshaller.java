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
package com.amazonaws.services.finspacedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataViewSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataViewSummaryJsonUnmarshaller implements Unmarshaller<DataViewSummary, JsonUnmarshallerContext> {

    public DataViewSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataViewSummary dataViewSummary = new DataViewSummary();

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
                if (context.testExpression("dataViewId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setDataViewId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataViewArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setDataViewArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("asOfTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setAsOfTimestamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("partitionColumns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setPartitionColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("sortColumns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setSortColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setErrorInfo(DataViewErrorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("destinationTypeProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setDestinationTypeProperties(DataViewDestinationTypeParamsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("autoUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setAutoUpdate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setCreateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataViewSummary.setLastModifiedTime(context.getUnmarshaller(Long.class).unmarshall(context));
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

        return dataViewSummary;
    }

    private static DataViewSummaryJsonUnmarshaller instance;

    public static DataViewSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataViewSummaryJsonUnmarshaller();
        return instance;
    }
}
