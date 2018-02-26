/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Elastic Pool DTU capability.
 */
public class ElasticPoolDtuCapability {
    /**
     * The DTU limit for the pool.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /**
     * The maximum number of databases supported.
     */
    @JsonProperty(value = "maxDatabaseCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxDatabaseCount;

    /**
     * The included (free) max size for this DTU.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /**
     * The list of supported max sizes.
     */
    @JsonProperty(value = "supportedMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeCapability> supportedMaxSizes;

    /**
     * The list of supported per database max sizes.
     */
    @JsonProperty(value = "supportedPerDatabaseMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeCapability> supportedPerDatabaseMaxSizes;

    /**
     * The list of supported per database max DTUs.
     */
    @JsonProperty(value = "supportedPerDatabaseMaxDtus", access = JsonProperty.Access.WRITE_ONLY)
    private List<ElasticPoolPerDatabaseMaxDtuCapability> supportedPerDatabaseMaxDtus;

    /**
     * The status of the capability. Possible values include: 'Visible',
     * 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the maxDatabaseCount value.
     *
     * @return the maxDatabaseCount value
     */
    public Integer maxDatabaseCount() {
        return this.maxDatabaseCount;
    }

    /**
     * Get the includedMaxSize value.
     *
     * @return the includedMaxSize value
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

    /**
     * Get the supportedMaxSizes value.
     *
     * @return the supportedMaxSizes value
     */
    public List<MaxSizeCapability> supportedMaxSizes() {
        return this.supportedMaxSizes;
    }

    /**
     * Get the supportedPerDatabaseMaxSizes value.
     *
     * @return the supportedPerDatabaseMaxSizes value
     */
    public List<MaxSizeCapability> supportedPerDatabaseMaxSizes() {
        return this.supportedPerDatabaseMaxSizes;
    }

    /**
     * Get the supportedPerDatabaseMaxDtus value.
     *
     * @return the supportedPerDatabaseMaxDtus value
     */
    public List<ElasticPoolPerDatabaseMaxDtuCapability> supportedPerDatabaseMaxDtus() {
        return this.supportedPerDatabaseMaxDtus;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the ElasticPoolDtuCapability object itself.
     */
    public ElasticPoolDtuCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

}