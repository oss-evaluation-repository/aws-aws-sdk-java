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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BoxConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BoxConfigurationJsonUnmarshaller implements Unmarshaller<BoxConfiguration, JsonUnmarshallerContext> {

    public BoxConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        BoxConfiguration boxConfiguration = new BoxConfiguration();

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
                if (context.testExpression("EnterpriseId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setEnterpriseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseChangeLog", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setUseChangeLog(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlComments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setCrawlComments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlTasks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setCrawlTasks(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlWebLinks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setCrawlWebLinks(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("FileFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setFileFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TaskFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setTaskFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CommentFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setCommentFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("WebLinkFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setWebLinkFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InclusionPatterns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionPatterns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    boxConfiguration.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return boxConfiguration;
    }

    private static BoxConfigurationJsonUnmarshaller instance;

    public static BoxConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BoxConfigurationJsonUnmarshaller();
        return instance;
    }
}
