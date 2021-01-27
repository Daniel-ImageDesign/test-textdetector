package com.image.design.textdetector.model.protocol;

import com.image.design.textdetector.model.response.ProtocolResponseResult;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Getter
@Setter
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProcessingProtocol {

    private ProtocolResponseResult protocolResponseResult = new ProtocolResponseResult();
}