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
package com.amazonaws.services.cloudhsmv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsmv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Cluster JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterJsonUnmarshaller implements Unmarshaller<Cluster, JsonUnmarshallerContext> {

    public Cluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        Cluster cluster = new Cluster();

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
                if (context.testExpression("BackupPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setBackupPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupRetentionPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setBackupRetentionPolicy(BackupRetentionPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClusterId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setCreateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Hsms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setHsms(new ListUnmarshaller<Hsm>(HsmJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("HsmType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setHsmType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreCoPassword", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setPreCoPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSecurityGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBackupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSourceBackupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStateMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetMapping", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSubnetMapping(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Certificates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setCertificates(CertificatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TagList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setTagList(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return cluster;
    }

    private static ClusterJsonUnmarshaller instance;

    public static ClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonUnmarshaller();
        return instance;
    }
}
