/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StartInstanceRefreshRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInstanceRefreshRequestMarshaller implements Marshaller<Request<StartInstanceRefreshRequest>, StartInstanceRefreshRequest> {

    public Request<StartInstanceRefreshRequest> marshall(StartInstanceRefreshRequest startInstanceRefreshRequest) {

        if (startInstanceRefreshRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartInstanceRefreshRequest> request = new DefaultRequest<StartInstanceRefreshRequest>(startInstanceRefreshRequest, "AmazonAutoScaling");
        request.addParameter("Action", "StartInstanceRefresh");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (startInstanceRefreshRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(startInstanceRefreshRequest.getAutoScalingGroupName()));
        }

        if (startInstanceRefreshRequest.getStrategy() != null) {
            request.addParameter("Strategy", StringUtils.fromString(startInstanceRefreshRequest.getStrategy()));
        }

        {
            DesiredConfiguration desiredConfiguration = startInstanceRefreshRequest.getDesiredConfiguration();
            if (desiredConfiguration != null) {

                {
                    LaunchTemplateSpecification launchTemplate = desiredConfiguration.getLaunchTemplate();
                    if (launchTemplate != null) {

                        if (launchTemplate.getLaunchTemplateId() != null) {
                            request.addParameter("DesiredConfiguration.LaunchTemplate.LaunchTemplateId",
                                    StringUtils.fromString(launchTemplate.getLaunchTemplateId()));
                        }

                        if (launchTemplate.getLaunchTemplateName() != null) {
                            request.addParameter("DesiredConfiguration.LaunchTemplate.LaunchTemplateName",
                                    StringUtils.fromString(launchTemplate.getLaunchTemplateName()));
                        }

                        if (launchTemplate.getVersion() != null) {
                            request.addParameter("DesiredConfiguration.LaunchTemplate.Version", StringUtils.fromString(launchTemplate.getVersion()));
                        }
                    }
                }

                {
                    MixedInstancesPolicy mixedInstancesPolicy = desiredConfiguration.getMixedInstancesPolicy();
                    if (mixedInstancesPolicy != null) {

                        {
                            LaunchTemplate launchTemplate = mixedInstancesPolicy.getLaunchTemplate();
                            if (launchTemplate != null) {

                                {
                                    LaunchTemplateSpecification launchTemplateSpecification = launchTemplate.getLaunchTemplateSpecification();
                                    if (launchTemplateSpecification != null) {

                                        if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                                            request.addParameter(
                                                    "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.LaunchTemplateId",
                                                    StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                                        }

                                        if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                                            request.addParameter(
                                                    "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.LaunchTemplateName",
                                                    StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                                        }

                                        if (launchTemplateSpecification.getVersion() != null) {
                                            request.addParameter(
                                                    "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.Version",
                                                    StringUtils.fromString(launchTemplateSpecification.getVersion()));
                                        }
                                    }
                                }

                                if (!launchTemplate.getOverrides().isEmpty()
                                        || !((com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) launchTemplate.getOverrides()).isAutoConstruct()) {
                                    com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides> overridesList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) launchTemplate
                                            .getOverrides();
                                    int overridesListIndex = 1;

                                    for (LaunchTemplateOverrides overridesListValue : overridesList) {
                                        if (overridesListValue != null) {

                                            if (overridesListValue.getInstanceType() != null) {
                                                request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                        + overridesListIndex + ".InstanceType", StringUtils.fromString(overridesListValue.getInstanceType()));
                                            }

                                            if (overridesListValue.getWeightedCapacity() != null) {
                                                request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                        + overridesListIndex + ".WeightedCapacity",
                                                        StringUtils.fromString(overridesListValue.getWeightedCapacity()));
                                            }

                                            {
                                                LaunchTemplateSpecification launchTemplateSpecification = overridesListValue.getLaunchTemplateSpecification();
                                                if (launchTemplateSpecification != null) {

                                                    if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".LaunchTemplateSpecification.LaunchTemplateId",
                                                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                                                    }

                                                    if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".LaunchTemplateSpecification.LaunchTemplateName",
                                                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                                                    }

                                                    if (launchTemplateSpecification.getVersion() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".LaunchTemplateSpecification.Version",
                                                                StringUtils.fromString(launchTemplateSpecification.getVersion()));
                                                    }
                                                }
                                            }
                                        }
                                        overridesListIndex++;
                                    }
                                }
                            }
                        }

                        {
                            InstancesDistribution instancesDistribution = mixedInstancesPolicy.getInstancesDistribution();
                            if (instancesDistribution != null) {

                                if (instancesDistribution.getOnDemandAllocationStrategy() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.OnDemandAllocationStrategy",
                                            StringUtils.fromString(instancesDistribution.getOnDemandAllocationStrategy()));
                                }

                                if (instancesDistribution.getOnDemandBaseCapacity() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.OnDemandBaseCapacity",
                                            StringUtils.fromInteger(instancesDistribution.getOnDemandBaseCapacity()));
                                }

                                if (instancesDistribution.getOnDemandPercentageAboveBaseCapacity() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.OnDemandPercentageAboveBaseCapacity",
                                            StringUtils.fromInteger(instancesDistribution.getOnDemandPercentageAboveBaseCapacity()));
                                }

                                if (instancesDistribution.getSpotAllocationStrategy() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.SpotAllocationStrategy",
                                            StringUtils.fromString(instancesDistribution.getSpotAllocationStrategy()));
                                }

                                if (instancesDistribution.getSpotInstancePools() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.SpotInstancePools",
                                            StringUtils.fromInteger(instancesDistribution.getSpotInstancePools()));
                                }

                                if (instancesDistribution.getSpotMaxPrice() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.SpotMaxPrice",
                                            StringUtils.fromString(instancesDistribution.getSpotMaxPrice()));
                                }
                            }
                        }
                    }
                }
            }
        }

        {
            RefreshPreferences preferences = startInstanceRefreshRequest.getPreferences();
            if (preferences != null) {

                if (preferences.getMinHealthyPercentage() != null) {
                    request.addParameter("Preferences.MinHealthyPercentage", StringUtils.fromInteger(preferences.getMinHealthyPercentage()));
                }

                if (preferences.getInstanceWarmup() != null) {
                    request.addParameter("Preferences.InstanceWarmup", StringUtils.fromInteger(preferences.getInstanceWarmup()));
                }

                if (!preferences.getCheckpointPercentages().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<Integer>) preferences.getCheckpointPercentages()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<Integer> checkpointPercentagesList = (com.amazonaws.internal.SdkInternalList<Integer>) preferences
                            .getCheckpointPercentages();
                    int checkpointPercentagesListIndex = 1;

                    for (Integer checkpointPercentagesListValue : checkpointPercentagesList) {
                        if (checkpointPercentagesListValue != null) {
                            request.addParameter("Preferences.CheckpointPercentages.member." + checkpointPercentagesListIndex,
                                    StringUtils.fromInteger(checkpointPercentagesListValue));
                        }
                        checkpointPercentagesListIndex++;
                    }
                }

                if (preferences.getCheckpointDelay() != null) {
                    request.addParameter("Preferences.CheckpointDelay", StringUtils.fromInteger(preferences.getCheckpointDelay()));
                }

                if (preferences.getSkipMatching() != null) {
                    request.addParameter("Preferences.SkipMatching", StringUtils.fromBoolean(preferences.getSkipMatching()));
                }
            }
        }

        return request;
    }

}
