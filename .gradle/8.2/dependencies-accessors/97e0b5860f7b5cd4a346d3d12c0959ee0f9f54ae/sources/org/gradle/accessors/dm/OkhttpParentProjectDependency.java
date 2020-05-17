package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class OkhttpParentProjectDependency extends DelegatingProjectDependency {

    @Inject
    public OkhttpParentProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":android-test"
     */
    public AndroidTestProjectDependency getAndroidTest() { return new AndroidTestProjectDependency(getFactory(), create(":android-test")); }

    /**
     * Creates a project dependency on the project at path ":logging-interceptor"
     */
    public LoggingInterceptorProjectDependency getLoggingInterceptor() { return new LoggingInterceptorProjectDependency(getFactory(), create(":logging-interceptor")); }

    /**
     * Creates a project dependency on the project at path ":mockwebserver"
     */
    public MockwebserverProjectDependency getMockwebserver() { return new MockwebserverProjectDependency(getFactory(), create(":mockwebserver")); }

    /**
     * Creates a project dependency on the project at path ":mockwebserver3"
     */
    public Mockwebserver3ProjectDependency getMockwebserver3() { return new Mockwebserver3ProjectDependency(getFactory(), create(":mockwebserver3")); }

    /**
     * Creates a project dependency on the project at path ":mockwebserver3-junit4"
     */
    public Mockwebserver3Junit4ProjectDependency getMockwebserver3Junit4() { return new Mockwebserver3Junit4ProjectDependency(getFactory(), create(":mockwebserver3-junit4")); }

    /**
     * Creates a project dependency on the project at path ":mockwebserver3-junit5"
     */
    public Mockwebserver3Junit5ProjectDependency getMockwebserver3Junit5() { return new Mockwebserver3Junit5ProjectDependency(getFactory(), create(":mockwebserver3-junit5")); }

    /**
     * Creates a project dependency on the project at path ":okcurl"
     */
    public OkcurlProjectDependency getOkcurl() { return new OkcurlProjectDependency(getFactory(), create(":okcurl")); }

    /**
     * Creates a project dependency on the project at path ":okhttp"
     */
    public OkhttpProjectDependency getOkhttp() { return new OkhttpProjectDependency(getFactory(), create(":okhttp")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-android"
     */
    public OkhttpAndroidProjectDependency getOkhttpAndroid() { return new OkhttpAndroidProjectDependency(getFactory(), create(":okhttp-android")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-bom"
     */
    public OkhttpBomProjectDependency getOkhttpBom() { return new OkhttpBomProjectDependency(getFactory(), create(":okhttp-bom")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-brotli"
     */
    public OkhttpBrotliProjectDependency getOkhttpBrotli() { return new OkhttpBrotliProjectDependency(getFactory(), create(":okhttp-brotli")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-coroutines"
     */
    public OkhttpCoroutinesProjectDependency getOkhttpCoroutines() { return new OkhttpCoroutinesProjectDependency(getFactory(), create(":okhttp-coroutines")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-dnsoverhttps"
     */
    public OkhttpDnsoverhttpsProjectDependency getOkhttpDnsoverhttps() { return new OkhttpDnsoverhttpsProjectDependency(getFactory(), create(":okhttp-dnsoverhttps")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-hpacktests"
     */
    public OkhttpHpacktestsProjectDependency getOkhttpHpacktests() { return new OkhttpHpacktestsProjectDependency(getFactory(), create(":okhttp-hpacktests")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-idna-mapping-table"
     */
    public OkhttpIdnaMappingTableProjectDependency getOkhttpIdnaMappingTable() { return new OkhttpIdnaMappingTableProjectDependency(getFactory(), create(":okhttp-idna-mapping-table")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-sse"
     */
    public OkhttpSseProjectDependency getOkhttpSse() { return new OkhttpSseProjectDependency(getFactory(), create(":okhttp-sse")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-testing-support"
     */
    public OkhttpTestingSupportProjectDependency getOkhttpTestingSupport() { return new OkhttpTestingSupportProjectDependency(getFactory(), create(":okhttp-testing-support")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-tls"
     */
    public OkhttpTlsProjectDependency getOkhttpTls() { return new OkhttpTlsProjectDependency(getFactory(), create(":okhttp-tls")); }

    /**
     * Creates a project dependency on the project at path ":okhttp-urlconnection"
     */
    public OkhttpUrlconnectionProjectDependency getOkhttpUrlconnection() { return new OkhttpUrlconnectionProjectDependency(getFactory(), create(":okhttp-urlconnection")); }

    /**
     * Creates a project dependency on the project at path ":samples"
     */
    public SamplesProjectDependency getSamples() { return new SamplesProjectDependency(getFactory(), create(":samples")); }

}
