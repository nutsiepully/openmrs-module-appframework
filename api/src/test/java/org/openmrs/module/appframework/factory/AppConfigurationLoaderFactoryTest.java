package org.openmrs.module.appframework.factory;

import org.junit.Test;
import org.openmrs.module.appframework.domain.AppDescriptor;
import org.openmrs.module.appframework.domain.Extension;
import org.openmrs.module.appframework.repository.AllAppDescriptors;
import org.openmrs.module.appframework.repository.AllExtensions;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AppConfigurationLoaderFactoryTest extends BaseModuleContextSensitiveTest {

    @Autowired
    AppConfigurationLoaderFactory appConfigurationLoaderFactory;

    @Autowired
    AllAppDescriptors allAppDescriptors;

    @Autowired
    AllExtensions allExtensions;

    @Test
    public void testConfigurationLoad() throws IOException {
        List<AppDescriptor> appDescriptors = appConfigurationLoaderFactory.getAppDescriptors();
        List<Extension> extensions = appConfigurationLoaderFactory.getExtensions();

        assertEquals(3, appDescriptors.size());
        assertEquals(2, extensions.size());
    }

}
