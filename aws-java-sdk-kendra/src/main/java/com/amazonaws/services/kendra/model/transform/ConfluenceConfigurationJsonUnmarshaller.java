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
 * ConfluenceConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfluenceConfigurationJsonUnmarshaller implements Unmarshaller<ConfluenceConfiguration, JsonUnmarshallerContext> {

    public ConfluenceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfluenceConfiguration confluenceConfiguration = new ConfluenceConfiguration();

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
                if (context.testExpression("ServerUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setServerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SpaceConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setSpaceConfiguration(ConfluenceSpaceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PageConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setPageConfiguration(ConfluencePageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BlogConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setBlogConfiguration(ConfluenceBlogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachmentConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setAttachmentConfiguration(ConfluenceAttachmentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InclusionPatterns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionPatterns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ProxyConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setProxyConfiguration(ProxyConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AuthenticationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    confluenceConfiguration.setAuthenticationType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return confluenceConfiguration;
    }

    private static ConfluenceConfigurationJsonUnmarshaller instance;

    public static ConfluenceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfluenceConfigurationJsonUnmarshaller();
        return instance;
    }
}
