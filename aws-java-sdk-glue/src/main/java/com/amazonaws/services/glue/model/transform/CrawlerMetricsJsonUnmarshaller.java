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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CrawlerMetrics JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlerMetricsJsonUnmarshaller implements Unmarshaller<CrawlerMetrics, JsonUnmarshallerContext> {

    public CrawlerMetrics unmarshall(JsonUnmarshallerContext context) throws Exception {
        CrawlerMetrics crawlerMetrics = new CrawlerMetrics();

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
                if (context.testExpression("CrawlerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerMetrics.setCrawlerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeLeftSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerMetrics.setTimeLeftSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("StillEstimating", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerMetrics.setStillEstimating(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastRuntimeSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerMetrics.setLastRuntimeSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("MedianRuntimeSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerMetrics.setMedianRuntimeSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("TablesCreated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerMetrics.setTablesCreated(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesUpdated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerMetrics.setTablesUpdated(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TablesDeleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerMetrics.setTablesDeleted(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return crawlerMetrics;
    }

    private static CrawlerMetricsJsonUnmarshaller instance;

    public static CrawlerMetricsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerMetricsJsonUnmarshaller();
        return instance;
    }
}
