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
package com.amazonaws.services.devicefarm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Run JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunJsonUnmarshaller implements Unmarshaller<Run, JsonUnmarshallerContext> {

    public Run unmarshall(JsonUnmarshallerContext context) throws Exception {
        Run run = new Run();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("result", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("started", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setStarted(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("stopped", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setStopped(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("counters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setCounters(CountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalJobs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setTotalJobs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("completedJobs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setCompletedJobs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("billingMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setBillingMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setDeviceMinutes(DeviceMinutesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("networkProfile", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setNetworkProfile(NetworkProfileJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("parsingResultUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setParsingResultUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resultCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setResultCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("seed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setSeed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("appUpload", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setAppUpload(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setEventCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("jobTimeoutMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setJobTimeoutMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("devicePoolArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setDevicePoolArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("locale", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("radios", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setRadios(RadiosJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setLocation(LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customerArtifactPaths", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setCustomerArtifactPaths(CustomerArtifactPathsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("webUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setWebUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("skipAppResign", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setSkipAppResign(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("testSpecArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setTestSpecArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceSelectionResult", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setDeviceSelectionResult(DeviceSelectionResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    run.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return run;
    }

    private static RunJsonUnmarshaller instance;

    public static RunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RunJsonUnmarshaller();
        return instance;
    }
}
