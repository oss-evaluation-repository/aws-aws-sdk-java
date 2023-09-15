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
package com.amazonaws.services.elasticsearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ElasticsearchDomainConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchDomainConfigJsonUnmarshaller implements Unmarshaller<ElasticsearchDomainConfig, JsonUnmarshallerContext> {

    public ElasticsearchDomainConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ElasticsearchDomainConfig elasticsearchDomainConfig = new ElasticsearchDomainConfig();

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
                if (context.testExpression("ElasticsearchVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setElasticsearchVersion(ElasticsearchVersionStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ElasticsearchClusterConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setElasticsearchClusterConfig(ElasticsearchClusterConfigStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EBSOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setEBSOptions(EBSOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AccessPolicies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setAccessPolicies(AccessPoliciesStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnapshotOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setSnapshotOptions(SnapshotOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VPCOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setVPCOptions(VPCDerivedInfoStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CognitoOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setCognitoOptions(CognitoOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionAtRestOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setEncryptionAtRestOptions(EncryptionAtRestOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NodeToNodeEncryptionOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsStatusJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("AdvancedOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setAdvancedOptions(AdvancedOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LogPublishingOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setLogPublishingOptions(LogPublishingOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DomainEndpointOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setDomainEndpointOptions(DomainEndpointOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedSecurityOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setAdvancedSecurityOptions(AdvancedSecurityOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoTuneOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setAutoTuneOptions(AutoTuneOptionsStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChangeProgressDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainConfig.setChangeProgressDetails(ChangeProgressDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return elasticsearchDomainConfig;
    }

    private static ElasticsearchDomainConfigJsonUnmarshaller instance;

    public static ElasticsearchDomainConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainConfigJsonUnmarshaller();
        return instance;
    }
}
