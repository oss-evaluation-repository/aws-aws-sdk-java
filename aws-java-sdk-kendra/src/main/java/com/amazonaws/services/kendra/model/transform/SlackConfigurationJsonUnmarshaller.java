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
 * SlackConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlackConfigurationJsonUnmarshaller implements Unmarshaller<SlackConfiguration, JsonUnmarshallerContext> {

    public SlackConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        SlackConfiguration slackConfiguration = new SlackConfiguration();

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
                if (context.testExpression("TeamId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setTeamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SlackEntityList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setSlackEntityList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("UseChangeLog", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setUseChangeLog(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlBotMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setCrawlBotMessage(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExcludeArchived", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setExcludeArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SinceCrawlDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setSinceCrawlDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LookBackPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setLookBackPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PrivateChannelFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setPrivateChannelFilter(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("PublicChannelFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setPublicChannelFilter(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InclusionPatterns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionPatterns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slackConfiguration.setFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

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

        return slackConfiguration;
    }

    private static SlackConfigurationJsonUnmarshaller instance;

    public static SlackConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SlackConfigurationJsonUnmarshaller();
        return instance;
    }
}
