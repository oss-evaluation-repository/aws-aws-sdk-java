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
 * ElasticsearchDomainStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchDomainStatusJsonUnmarshaller implements Unmarshaller<ElasticsearchDomainStatus, JsonUnmarshallerContext> {

    public ElasticsearchDomainStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        ElasticsearchDomainStatus elasticsearchDomainStatus = new ElasticsearchDomainStatus();

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
                if (context.testExpression("DomainId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Created", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setCreated(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Deleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setDeleted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Endpoints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setEndpoints(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Processing", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setProcessing(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UpgradeProcessing", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setUpgradeProcessing(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ElasticsearchVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setElasticsearchVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ElasticsearchClusterConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setElasticsearchClusterConfig(ElasticsearchClusterConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EBSOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setEBSOptions(EBSOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AccessPolicies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setAccessPolicies(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setSnapshotOptions(SnapshotOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VPCOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setVPCOptions(VPCDerivedInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CognitoOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setCognitoOptions(CognitoOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionAtRestOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setEncryptionAtRestOptions(EncryptionAtRestOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NodeToNodeEncryptionOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setAdvancedOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LogPublishingOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setLogPublishingOptions(new MapUnmarshaller<String, LogPublishingOption>(context.getUnmarshaller(String.class),
                            LogPublishingOptionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ServiceSoftwareOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setServiceSoftwareOptions(ServiceSoftwareOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DomainEndpointOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setDomainEndpointOptions(DomainEndpointOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedSecurityOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setAdvancedSecurityOptions(AdvancedSecurityOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoTuneOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setAutoTuneOptions(AutoTuneOptionsOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChangeProgressDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    elasticsearchDomainStatus.setChangeProgressDetails(ChangeProgressDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return elasticsearchDomainStatus;
    }

    private static ElasticsearchDomainStatusJsonUnmarshaller instance;

    public static ElasticsearchDomainStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainStatusJsonUnmarshaller();
        return instance;
    }
}
