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

/**
 * <p>
 * Amazon CloudWatch Internet Monitor provides visibility into how internet issues impact the performance and
 * availability between your applications hosted on Amazon Web Services and your end users, reducing the time it takes
 * for you to diagnose these issues, from days to minutes. You can explore internet measurements for different time
 * frames and at different geographic granularities, and quickly visualize the impact of issues, and then take action to
 * improve your end users' experience, for example, by switching to other Amazon Web Services services or rerouting
 * traffic to your workload through differentAmazon Web Services Regions.
 * </p>
 * <p>
 * If the issue is caused by the Amazon Web Services network, you'll automatically receive an Amazon Web Services Health
 * Dashboard notification with the steps that Amazon Web Services is taking to mitigate the problem. To support
 * integrating health information for geographies and networks specific to your application, Internet Monitor delivers
 * measurements to CloudWatch Logs and CloudWatch Metrics. Internet Monitor also sends health events to Amazon
 * EventBridge, so you can set up notifications. Internet Monitor monitors internet connectivity for your application
 * through Amazon Virtual Private Clouds (VPCs), Amazon CloudFront distributions, and Amazon WorkSpaces directories.
 * </p>
 * <p>
 * To use Internet Monitor, you create a <i>monitor</i> and add resources to it, Virtual Private Clouds (VPCs), Amazon
 * CloudFront distributions, or WorkSpaces directories that show where your application's internet traffic is. Internet
 * Monitor then provides internet measurements from Amazon Web Services that are specific to the locations and networks
 * that communicate with your application. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html"> Using Amazon
 * CloudWatch Internet Monitor</a> in the Amazon CloudWatch User Guide.
 * </p>
 */
package com.amazonaws.services.internetmonitor;

