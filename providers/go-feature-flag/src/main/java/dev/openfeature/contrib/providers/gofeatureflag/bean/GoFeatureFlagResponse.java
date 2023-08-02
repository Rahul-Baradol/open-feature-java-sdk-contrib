package dev.openfeature.contrib.providers.gofeatureflag.bean;

import lombok.Data;

import java.util.Map;

/**
 * GoFeatureFlagResponse is the response returned by the relay proxy.
 */
@Data
public class GoFeatureFlagResponse {
    private boolean trackEvents;
    private String variationType;
    private boolean failed;
    private String version;
    private String reason;
    private String errorCode;
    private Object value;
    private Boolean cacheable;
    private Map<String, Object> metadata;
}


