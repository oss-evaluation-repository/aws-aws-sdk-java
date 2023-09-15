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
package com.amazonaws.services.directory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DirectoryDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryDescriptionJsonUnmarshaller implements Unmarshaller<DirectoryDescription, JsonUnmarshallerContext> {

    public DirectoryDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        DirectoryDescription directoryDescription = new DirectoryDescription();

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
                if (context.testExpression("DirectoryId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShortName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setShortName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Size", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Edition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setEdition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Alias", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setAccessUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsIpAddrs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setDnsIpAddrs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Stage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setStage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setShareStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setShareMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareNotes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setShareNotes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setLaunchTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StageLastUpdatedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setStageLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setVpcSettings(DirectoryVpcSettingsDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ConnectSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setConnectSettings(DirectoryConnectSettingsDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RadiusSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setRadiusSettings(RadiusSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RadiusStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setRadiusStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StageReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setStageReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SsoEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setSsoEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DesiredNumberOfDomainControllers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setDesiredNumberOfDomainControllers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OwnerDirectoryDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setOwnerDirectoryDescription(OwnerDirectoryDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegionsInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setRegionsInfo(RegionsInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OsVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directoryDescription.setOsVersion(context.getUnmarshaller(String.class).unmarshall(context));
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

        return directoryDescription;
    }

    private static DirectoryDescriptionJsonUnmarshaller instance;

    public static DirectoryDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryDescriptionJsonUnmarshaller();
        return instance;
    }
}
