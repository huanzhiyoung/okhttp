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
public class SamplesProjectDependency extends DelegatingProjectDependency {

    @Inject
    public SamplesProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":samples:compare"
     */
    public Samples_CompareProjectDependency getCompare() { return new Samples_CompareProjectDependency(getFactory(), create(":samples:compare")); }

    /**
     * Creates a project dependency on the project at path ":samples:crawler"
     */
    public Samples_CrawlerProjectDependency getCrawler() { return new Samples_CrawlerProjectDependency(getFactory(), create(":samples:crawler")); }

    /**
     * Creates a project dependency on the project at path ":samples:guide"
     */
    public Samples_GuideProjectDependency getGuide() { return new Samples_GuideProjectDependency(getFactory(), create(":samples:guide")); }

    /**
     * Creates a project dependency on the project at path ":samples:simple-client"
     */
    public Samples_SimpleClientProjectDependency getSimpleClient() { return new Samples_SimpleClientProjectDependency(getFactory(), create(":samples:simple-client")); }

    /**
     * Creates a project dependency on the project at path ":samples:slack"
     */
    public Samples_SlackProjectDependency getSlack() { return new Samples_SlackProjectDependency(getFactory(), create(":samples:slack")); }

    /**
     * Creates a project dependency on the project at path ":samples:static-server"
     */
    public Samples_StaticServerProjectDependency getStaticServer() { return new Samples_StaticServerProjectDependency(getFactory(), create(":samples:static-server")); }

    /**
     * Creates a project dependency on the project at path ":samples:tlssurvey"
     */
    public Samples_TlssurveyProjectDependency getTlssurvey() { return new Samples_TlssurveyProjectDependency(getFactory(), create(":samples:tlssurvey")); }

    /**
     * Creates a project dependency on the project at path ":samples:unixdomainsockets"
     */
    public Samples_UnixdomainsocketsProjectDependency getUnixdomainsockets() { return new Samples_UnixdomainsocketsProjectDependency(getFactory(), create(":samples:unixdomainsockets")); }

}
