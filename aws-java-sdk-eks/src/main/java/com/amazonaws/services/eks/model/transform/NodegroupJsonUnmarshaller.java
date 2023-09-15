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
package com.amazonaws.services.eks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Nodegroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodegroupJsonUnmarshaller implements Unmarshaller<Nodegroup, JsonUnmarshallerContext> {

    public Nodegroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        Nodegroup nodegroup = new Nodegroup();

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
                if (context.testExpression("nodegroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setNodegroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nodegroupArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setNodegroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("releaseVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setReleaseVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capacityType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setCapacityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scalingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setScalingConfig(NodegroupScalingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instanceTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("subnets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("remoteAccess", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setRemoteAccess(RemoteAccessConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("amiType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setAmiType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nodeRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setNodeRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("labels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setLabels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("taints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setTaints(new ListUnmarshaller<Taint>(TaintJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setResources(NodegroupResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("diskSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setDiskSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("health", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setHealth(NodegroupHealthJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("updateConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setUpdateConfig(NodegroupUpdateConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("launchTemplate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setLaunchTemplate(LaunchTemplateSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    nodegroup.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return nodegroup;
    }

    private static NodegroupJsonUnmarshaller instance;

    public static NodegroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NodegroupJsonUnmarshaller();
        return instance;
    }
}
