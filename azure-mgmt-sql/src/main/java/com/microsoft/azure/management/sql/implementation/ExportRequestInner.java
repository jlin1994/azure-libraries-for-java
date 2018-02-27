/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.StorageKeyType;
import com.microsoft.azure.management.sql.AuthenticationType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Export database parameters.
 */
public class ExportRequestInner {
    /**
     * The type of the storage key to use. Possible values include:
     * 'StorageAccessKey', 'SharedAccessKey'.
     */
    @JsonProperty(value = "storageKeyType", required = true)
    private StorageKeyType storageKeyType;

    /**
     * The storage key to use.  If storage key type is SharedAccessKey, it must
     * be preceded with a "?.".
     */
    @JsonProperty(value = "storageKey", required = true)
    private String storageKey;

    /**
     * The storage uri to use.
     */
    @JsonProperty(value = "storageUri", required = true)
    private String storageUri;

    /**
     * The name of the SQL administrator.
     */
    @JsonProperty(value = "administratorLogin", required = true)
    private String administratorLogin;

    /**
     * The password of the SQL administrator.
     */
    @JsonProperty(value = "administratorLoginPassword", required = true)
    private String administratorLoginPassword;

    /**
     * The authentication type. Possible values include: 'SQL', 'ADPassword'.
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /**
     * Get the storageKeyType value.
     *
     * @return the storageKeyType value
     */
    public StorageKeyType storageKeyType() {
        return this.storageKeyType;
    }

    /**
     * Set the storageKeyType value.
     *
     * @param storageKeyType the storageKeyType value to set
     * @return the ExportRequestInner object itself.
     */
    public ExportRequestInner withStorageKeyType(StorageKeyType storageKeyType) {
        this.storageKeyType = storageKeyType;
        return this;
    }

    /**
     * Get the storageKey value.
     *
     * @return the storageKey value
     */
    public String storageKey() {
        return this.storageKey;
    }

    /**
     * Set the storageKey value.
     *
     * @param storageKey the storageKey value to set
     * @return the ExportRequestInner object itself.
     */
    public ExportRequestInner withStorageKey(String storageKey) {
        this.storageKey = storageKey;
        return this;
    }

    /**
     * Get the storageUri value.
     *
     * @return the storageUri value
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storageUri value.
     *
     * @param storageUri the storageUri value to set
     * @return the ExportRequestInner object itself.
     */
    public ExportRequestInner withStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }

    /**
     * Get the administratorLogin value.
     *
     * @return the administratorLogin value
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin value.
     *
     * @param administratorLogin the administratorLogin value to set
     * @return the ExportRequestInner object itself.
     */
    public ExportRequestInner withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword value.
     *
     * @return the administratorLoginPassword value
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword value.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set
     * @return the ExportRequestInner object itself.
     */
    public ExportRequestInner withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the authenticationType value.
     *
     * @return the authenticationType value
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType value.
     *
     * @param authenticationType the authenticationType value to set
     * @return the ExportRequestInner object itself.
     */
    public ExportRequestInner withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

}