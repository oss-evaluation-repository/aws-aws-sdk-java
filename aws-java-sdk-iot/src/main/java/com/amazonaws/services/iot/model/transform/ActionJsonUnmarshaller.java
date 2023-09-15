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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Action JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionJsonUnmarshaller implements Unmarshaller<Action, JsonUnmarshallerContext> {

    public Action unmarshall(JsonUnmarshallerContext context) throws Exception {
        Action action = new Action();

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
                if (context.testExpression("dynamoDB", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setDynamoDB(DynamoDBActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dynamoDBv2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setDynamoDBv2(DynamoDBv2ActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambda", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setLambda(LambdaActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setSns(SnsActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sqs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setSqs(SqsActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("kinesis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setKinesis(KinesisActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("republish", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setRepublish(RepublishActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("s3", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setS3(S3ActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("firehose", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setFirehose(FirehoseActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cloudwatchMetric", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setCloudwatchMetric(CloudwatchMetricActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cloudwatchAlarm", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setCloudwatchAlarm(CloudwatchAlarmActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cloudwatchLogs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setCloudwatchLogs(CloudwatchLogsActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("elasticsearch", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setElasticsearch(ElasticsearchActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("salesforce", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setSalesforce(SalesforceActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iotAnalytics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setIotAnalytics(IotAnalyticsActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iotEvents", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setIotEvents(IotEventsActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iotSiteWise", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setIotSiteWise(IotSiteWiseActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stepFunctions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setStepFunctions(StepFunctionsActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timestream", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setTimestream(TimestreamActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("http", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setHttp(HttpActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("kafka", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setKafka(KafkaActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("openSearch", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setOpenSearch(OpenSearchActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setLocation(LocationActionJsonUnmarshaller.getInstance().unmarshall(context));
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

        return action;
    }

    private static ActionJsonUnmarshaller instance;

    public static ActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionJsonUnmarshaller();
        return instance;
    }
}
