/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.miloclient;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelMiloclientSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_MILOCLIENT_PATH_ENDPOINT_URI_CONF = "camel.sink.path.endpointUri";
    public static final String CAMEL_SINK_MILOCLIENT_PATH_ENDPOINT_URI_DOC = "The OPC UA server endpoint";
    public static final String CAMEL_SINK_MILOCLIENT_PATH_ENDPOINT_URI_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_CLIENT_ID_CONF = "camel.sink.endpoint.clientId";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_CLIENT_ID_DOC = "A virtual client id to force the creation of a new connection instance";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_TYPE_CONF = "camel.sink.endpoint.dataChangeFilterDeadbandType";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_TYPE_DOC = "Deadband type for MonitorFilterType DataChangeFilter.";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_TYPE_DEFAULT = "0";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_VALUE_CONF = "camel.sink.endpoint.dataChangeFilterDeadbandValue";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_VALUE_DOC = "Deadband value for MonitorFilterType DataChangeFilter.";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_VALUE_DEFAULT = "0.0";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_TRIGGER_CONF = "camel.sink.endpoint.dataChangeFilterTrigger";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_TRIGGER_DOC = "Daata change trigger for data change monitor filter type. One of: [Status] [StatusValue] [StatusValueTimestamp]";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_TRIGGER_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DEFAULT_AWAIT_WRITES_CONF = "camel.sink.endpoint.defaultAwaitWrites";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DEFAULT_AWAIT_WRITES_DOC = "Default await setting for writes";
    public static final Boolean CAMEL_SINK_MILOCLIENT_ENDPOINT_DEFAULT_AWAIT_WRITES_DEFAULT = false;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_SUFFIX_CONF = "camel.sink.endpoint.discoveryEndpointSuffix";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_SUFFIX_DOC = "A suffix for endpoint URI when discovering";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_SUFFIX_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_URI_CONF = "camel.sink.endpoint.discoveryEndpointUri";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_URI_DOC = "An alternative discovery URI";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_URI_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_METHOD_CONF = "camel.sink.endpoint.method";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_METHOD_DOC = "The method definition (see Method ID)";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_METHOD_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MONITOR_FILTER_TYPE_CONF = "camel.sink.endpoint.monitorFilterType";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MONITOR_FILTER_TYPE_DOC = "Monitor Filter Type for MonitoredItems. One of: [dataChangeFilter]";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MONITOR_FILTER_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_NODE_CONF = "camel.sink.endpoint.node";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_NODE_DOC = "The node definition (see Node ID)";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_NODE_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SAMPLING_INTERVAL_CONF = "camel.sink.endpoint.samplingInterval";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SAMPLING_INTERVAL_DOC = "The sampling interval in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SAMPLING_INTERVAL_DEFAULT = "0.0";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_MILOCLIENT_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_ALLOWED_SECURITY_POLICIES_CONF = "camel.sink.endpoint.allowedSecurityPolicies";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_ALLOWED_SECURITY_POLICIES_DOC = "A set of allowed security policy URIs. Default is to accept all and use the highest.";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_ALLOWED_SECURITY_POLICIES_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_NAME_CONF = "camel.sink.endpoint.applicationName";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_NAME_DOC = "The application name";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_NAME_DEFAULT = "Apache Camel adapter for Eclipse Milo";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_URI_CONF = "camel.sink.endpoint.applicationUri";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_URI_DOC = "The application URI";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_URI_DEFAULT = "http://camel.apache.org/EclipseMilo/Client";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_CHANNEL_LIFETIME_CONF = "camel.sink.endpoint.channelLifetime";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_CHANNEL_LIFETIME_DOC = "Channel lifetime in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_CHANNEL_LIFETIME_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_ALIAS_CONF = "camel.sink.endpoint.keyAlias";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_ALIAS_DOC = "The name of the key in the keystore file";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_ALIAS_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_PASSWORD_CONF = "camel.sink.endpoint.keyPassword";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_PASSWORD_DOC = "The key password";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_PASSWORD_CONF = "camel.sink.endpoint.keyStorePassword";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_PASSWORD_DOC = "The keystore password";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_TYPE_CONF = "camel.sink.endpoint.keyStoreType";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_TYPE_DOC = "The key store type";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_URL_CONF = "camel.sink.endpoint.keyStoreUrl";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_URL_DOC = "The URL where the key should be loaded from";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_URL_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_PENDING_PUBLISH_REQUESTS_CONF = "camel.sink.endpoint.maxPendingPublishRequests";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_PENDING_PUBLISH_REQUESTS_DOC = "The maximum number of pending publish requests";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_PENDING_PUBLISH_REQUESTS_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_RESPONSE_MESSAGE_SIZE_CONF = "camel.sink.endpoint.maxResponseMessageSize";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_RESPONSE_MESSAGE_SIZE_DOC = "The maximum number of bytes a response message may have";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_RESPONSE_MESSAGE_SIZE_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_OVERRIDE_HOST_CONF = "camel.sink.endpoint.overrideHost";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_OVERRIDE_HOST_DOC = "Override the server reported endpoint host with the host from the endpoint URI.";
    public static final Boolean CAMEL_SINK_MILOCLIENT_ENDPOINT_OVERRIDE_HOST_DEFAULT = false;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_PRODUCT_URI_CONF = "camel.sink.endpoint.productUri";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_PRODUCT_URI_DOC = "The product URI";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_PRODUCT_URI_DEFAULT = "http://camel.apache.org/EclipseMilo";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUESTED_PUBLISHING_INTERVAL_CONF = "camel.sink.endpoint.requestedPublishingInterval";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUESTED_PUBLISHING_INTERVAL_DOC = "The requested publishing interval in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUESTED_PUBLISHING_INTERVAL_DEFAULT = "1_000.0";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUEST_TIMEOUT_CONF = "camel.sink.endpoint.requestTimeout";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUEST_TIMEOUT_DOC = "Request timeout in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUEST_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_NAME_CONF = "camel.sink.endpoint.sessionName";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_NAME_DOC = "Session name";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_TIMEOUT_CONF = "camel.sink.endpoint.sessionTimeout";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_TIMEOUT_DOC = "Session timeout in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CLIENT_ID_CONF = "camel.component.milo-client.clientId";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CLIENT_ID_DOC = "A virtual client id to force the creation of a new connection instance";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CONFIGURATION_CONF = "camel.component.milo-client.configuration";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CONFIGURATION_DOC = "All default options for client configurations";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_SUFFIX_CONF = "camel.component.milo-client.discoveryEndpointSuffix";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_SUFFIX_DOC = "A suffix for endpoint URI when discovering";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_SUFFIX_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_URI_CONF = "camel.component.milo-client.discoveryEndpointUri";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_URI_DOC = "An alternative discovery URI";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_URI_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.milo-client.lazyStartProducer";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_MILOCLIENT_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.milo-client.autowiredEnabled";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_MILOCLIENT_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_ALLOWED_SECURITY_POLICIES_CONF = "camel.component.milo-client.allowedSecurityPolicies";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_ALLOWED_SECURITY_POLICIES_DOC = "A set of allowed security policy URIs. Default is to accept all and use the highest.";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_ALLOWED_SECURITY_POLICIES_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_NAME_CONF = "camel.component.milo-client.applicationName";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_NAME_DOC = "The application name";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_NAME_DEFAULT = "Apache Camel adapter for Eclipse Milo";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_URI_CONF = "camel.component.milo-client.applicationUri";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_URI_DOC = "The application URI";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_URI_DEFAULT = "http://camel.apache.org/EclipseMilo/Client";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CHANNEL_LIFETIME_CONF = "camel.component.milo-client.channelLifetime";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CHANNEL_LIFETIME_DOC = "Channel lifetime in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_CHANNEL_LIFETIME_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_ALIAS_CONF = "camel.component.milo-client.keyAlias";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_ALIAS_DOC = "The name of the key in the keystore file";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_ALIAS_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_PASSWORD_CONF = "camel.component.milo-client.keyPassword";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_PASSWORD_DOC = "The key password";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_PASSWORD_CONF = "camel.component.milo-client.keyStorePassword";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_PASSWORD_DOC = "The keystore password";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_TYPE_CONF = "camel.component.milo-client.keyStoreType";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_TYPE_DOC = "The key store type";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_URL_CONF = "camel.component.milo-client.keyStoreUrl";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_URL_DOC = "The URL where the key should be loaded from";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_URL_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_PENDING_PUBLISH_REQUESTS_CONF = "camel.component.milo-client.maxPendingPublishRequests";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_PENDING_PUBLISH_REQUESTS_DOC = "The maximum number of pending publish requests";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_PENDING_PUBLISH_REQUESTS_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_RESPONSE_MESSAGE_SIZE_CONF = "camel.component.milo-client.maxResponseMessageSize";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_RESPONSE_MESSAGE_SIZE_DOC = "The maximum number of bytes a response message may have";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_RESPONSE_MESSAGE_SIZE_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MILO_CLIENT_CONNECTION_MANAGER_CONF = "camel.component.milo-client.miloClientConnectionManager";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MILO_CLIENT_CONNECTION_MANAGER_DOC = "Instance for managing client connections";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_MILO_CLIENT_CONNECTION_MANAGER_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_OVERRIDE_HOST_CONF = "camel.component.milo-client.overrideHost";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_OVERRIDE_HOST_DOC = "Override the server reported endpoint host with the host from the endpoint URI.";
    public static final Boolean CAMEL_SINK_MILOCLIENT_COMPONENT_OVERRIDE_HOST_DEFAULT = false;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_PRODUCT_URI_CONF = "camel.component.milo-client.productUri";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_PRODUCT_URI_DOC = "The product URI";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_PRODUCT_URI_DEFAULT = "http://camel.apache.org/EclipseMilo";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_REQUESTED_PUBLISHING_INTERVAL_CONF = "camel.component.milo-client.requestedPublishingInterval";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_REQUESTED_PUBLISHING_INTERVAL_DOC = "The requested publishing interval in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_REQUESTED_PUBLISHING_INTERVAL_DEFAULT = "1_000.0";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_REQUEST_TIMEOUT_CONF = "camel.component.milo-client.requestTimeout";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_REQUEST_TIMEOUT_DOC = "Request timeout in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_REQUEST_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_NAME_CONF = "camel.component.milo-client.sessionName";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_NAME_DOC = "Session name";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_TIMEOUT_CONF = "camel.component.milo-client.sessionTimeout";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_TIMEOUT_DOC = "Session timeout in milliseconds";
    public static final String CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_TIMEOUT_DEFAULT = null;

    public CamelMiloclientSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelMiloclientSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_MILOCLIENT_PATH_ENDPOINT_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_PATH_ENDPOINT_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MILOCLIENT_PATH_ENDPOINT_URI_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_CLIENT_ID_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_TYPE_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_DEADBAND_VALUE_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_TRIGGER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_TRIGGER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_DATA_CHANGE_FILTER_TRIGGER_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_DEFAULT_AWAIT_WRITES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOCLIENT_ENDPOINT_DEFAULT_AWAIT_WRITES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_DEFAULT_AWAIT_WRITES_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_SUFFIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_SUFFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_SUFFIX_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_DISCOVERY_ENDPOINT_URI_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_METHOD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_METHOD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_METHOD_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_MONITOR_FILTER_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_MONITOR_FILTER_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_MONITOR_FILTER_TYPE_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_NODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_NODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_NODE_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_SAMPLING_INTERVAL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_SAMPLING_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_SAMPLING_INTERVAL_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOCLIENT_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_ALLOWED_SECURITY_POLICIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_ALLOWED_SECURITY_POLICIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_ALLOWED_SECURITY_POLICIES_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_NAME_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_APPLICATION_URI_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_CHANNEL_LIFETIME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_CHANNEL_LIFETIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_CHANNEL_LIFETIME_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_ALIAS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_ALIAS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_ALIAS_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_PASSWORD_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_TYPE_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_KEY_STORE_URL_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_PENDING_PUBLISH_REQUESTS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_PENDING_PUBLISH_REQUESTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_PENDING_PUBLISH_REQUESTS_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_RESPONSE_MESSAGE_SIZE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_RESPONSE_MESSAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_MAX_RESPONSE_MESSAGE_SIZE_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_OVERRIDE_HOST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOCLIENT_ENDPOINT_OVERRIDE_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_OVERRIDE_HOST_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_PRODUCT_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_PRODUCT_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_PRODUCT_URI_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUESTED_PUBLISHING_INTERVAL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUESTED_PUBLISHING_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUESTED_PUBLISHING_INTERVAL_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUEST_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUEST_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_REQUEST_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_NAME_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_ENDPOINT_SESSION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_CLIENT_ID_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_SUFFIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_SUFFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_SUFFIX_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_DISCOVERY_ENDPOINT_URI_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOCLIENT_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOCLIENT_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_ALLOWED_SECURITY_POLICIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_ALLOWED_SECURITY_POLICIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_ALLOWED_SECURITY_POLICIES_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_NAME_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_APPLICATION_URI_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_CHANNEL_LIFETIME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_CHANNEL_LIFETIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_CHANNEL_LIFETIME_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_ALIAS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_ALIAS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_ALIAS_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_PASSWORD_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_TYPE_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_KEY_STORE_URL_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_PENDING_PUBLISH_REQUESTS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_PENDING_PUBLISH_REQUESTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_PENDING_PUBLISH_REQUESTS_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_RESPONSE_MESSAGE_SIZE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_RESPONSE_MESSAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_MAX_RESPONSE_MESSAGE_SIZE_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_MILO_CLIENT_CONNECTION_MANAGER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_MILO_CLIENT_CONNECTION_MANAGER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_MILO_CLIENT_CONNECTION_MANAGER_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_OVERRIDE_HOST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOCLIENT_COMPONENT_OVERRIDE_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_OVERRIDE_HOST_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_PRODUCT_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_PRODUCT_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_PRODUCT_URI_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_REQUESTED_PUBLISHING_INTERVAL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_REQUESTED_PUBLISHING_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_REQUESTED_PUBLISHING_INTERVAL_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_REQUEST_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_REQUEST_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_REQUEST_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_NAME_DOC);
        conf.define(CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOCLIENT_COMPONENT_SESSION_TIMEOUT_DOC);
        return conf;
    }
}