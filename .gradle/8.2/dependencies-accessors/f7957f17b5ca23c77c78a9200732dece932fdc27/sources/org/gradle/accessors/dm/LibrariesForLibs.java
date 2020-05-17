package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final AnimalsnifferLibraryAccessors laccForAnimalsnifferLibraryAccessors = new AnimalsnifferLibraryAccessors(owner);
    private final AquteLibraryAccessors laccForAquteLibraryAccessors = new AquteLibraryAccessors(owner);
    private final AssertjLibraryAccessors laccForAssertjLibraryAccessors = new AssertjLibraryAccessors(owner);
    private final BouncycastleLibraryAccessors laccForBouncycastleLibraryAccessors = new BouncycastleLibraryAccessors(owner);
    private final BrotliLibraryAccessors laccForBrotliLibraryAccessors = new BrotliLibraryAccessors(owner);
    private final CodehausLibraryAccessors laccForCodehausLibraryAccessors = new CodehausLibraryAccessors(owner);
    private final ConscryptLibraryAccessors laccForConscryptLibraryAccessors = new ConscryptLibraryAccessors(owner);
    private final FindbugsLibraryAccessors laccForFindbugsLibraryAccessors = new FindbugsLibraryAccessors(owner);
    private final GradlePluginLibraryAccessors laccForGradlePluginLibraryAccessors = new GradlePluginLibraryAccessors(owner);
    private final GuavaLibraryAccessors laccForGuavaLibraryAccessors = new GuavaLibraryAccessors(owner);
    private final JnrLibraryAccessors laccForJnrLibraryAccessors = new JnrLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final Junit5androidLibraryAccessors laccForJunit5androidLibraryAccessors = new Junit5androidLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final PlayservicesLibraryAccessors laccForPlayservicesLibraryAccessors = new PlayservicesLibraryAccessors(owner);
    private final RobolectricLibraryAccessors laccForRobolectricLibraryAccessors = new RobolectricLibraryAccessors(owner);
    private final SignatureLibraryAccessors laccForSignatureLibraryAccessors = new SignatureLibraryAccessors(owner);
    private final SquareupLibraryAccessors laccForSquareupLibraryAccessors = new SquareupLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for amazonCorretto (software.amazon.cryptools:AmazonCorrettoCryptoProvider)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAmazonCorretto() {
            return create("amazonCorretto");
    }

        /**
         * Creates a dependency provider for assertk (com.willowtreeapps.assertk:assertk)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAssertk() {
            return create("assertk");
    }

        /**
         * Creates a dependency provider for checkStyle (com.puppycrawl.tools:checkstyle)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCheckStyle() {
            return create("checkStyle");
    }

        /**
         * Creates a dependency provider for clikt (com.github.ajalt.clikt:clikt)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClikt() {
            return create("clikt");
    }

        /**
         * Creates a dependency provider for eclipseOsgi (org.eclipse.platform:org.eclipse.osgi)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEclipseOsgi() {
            return create("eclipseOsgi");
    }

        /**
         * Creates a dependency provider for hamcrestLibrary (org.hamcrest:hamcrest-library)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHamcrestLibrary() {
            return create("hamcrestLibrary");
    }

        /**
         * Creates a dependency provider for httpClient5 (org.apache.httpcomponents.client5:httpclient5)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getHttpClient5() {
            return create("httpClient5");
    }

        /**
         * Creates a dependency provider for jettyClient (org.eclipse.jetty:jetty-client)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJettyClient() {
            return create("jettyClient");
    }

        /**
         * Creates a dependency provider for jsoup (org.jsoup:jsoup)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsoup() {
            return create("jsoup");
    }

        /**
         * Creates a dependency provider for nativeImageSvm (org.graalvm.nativeimage:svm)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNativeImageSvm() {
            return create("nativeImageSvm");
    }

        /**
         * Creates a dependency provider for openjsse (org.openjsse:openjsse)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOpenjsse() {
            return create("openjsse");
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at animalsniffer
     */
    public AnimalsnifferLibraryAccessors getAnimalsniffer() {
        return laccForAnimalsnifferLibraryAccessors;
    }

    /**
     * Returns the group of libraries at aqute
     */
    public AquteLibraryAccessors getAqute() {
        return laccForAquteLibraryAccessors;
    }

    /**
     * Returns the group of libraries at assertj
     */
    public AssertjLibraryAccessors getAssertj() {
        return laccForAssertjLibraryAccessors;
    }

    /**
     * Returns the group of libraries at bouncycastle
     */
    public BouncycastleLibraryAccessors getBouncycastle() {
        return laccForBouncycastleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at brotli
     */
    public BrotliLibraryAccessors getBrotli() {
        return laccForBrotliLibraryAccessors;
    }

    /**
     * Returns the group of libraries at codehaus
     */
    public CodehausLibraryAccessors getCodehaus() {
        return laccForCodehausLibraryAccessors;
    }

    /**
     * Returns the group of libraries at conscrypt
     */
    public ConscryptLibraryAccessors getConscrypt() {
        return laccForConscryptLibraryAccessors;
    }

    /**
     * Returns the group of libraries at findbugs
     */
    public FindbugsLibraryAccessors getFindbugs() {
        return laccForFindbugsLibraryAccessors;
    }

    /**
     * Returns the group of libraries at gradlePlugin
     */
    public GradlePluginLibraryAccessors getGradlePlugin() {
        return laccForGradlePluginLibraryAccessors;
    }

    /**
     * Returns the group of libraries at guava
     */
    public GuavaLibraryAccessors getGuava() {
        return laccForGuavaLibraryAccessors;
    }

    /**
     * Returns the group of libraries at jnr
     */
    public JnrLibraryAccessors getJnr() {
        return laccForJnrLibraryAccessors;
    }

    /**
     * Returns the group of libraries at junit
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Returns the group of libraries at junit5android
     */
    public Junit5androidLibraryAccessors getJunit5android() {
        return laccForJunit5androidLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() {
        return laccForKotlinxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at playservices
     */
    public PlayservicesLibraryAccessors getPlayservices() {
        return laccForPlayservicesLibraryAccessors;
    }

    /**
     * Returns the group of libraries at robolectric
     */
    public RobolectricLibraryAccessors getRobolectric() {
        return laccForRobolectricLibraryAccessors;
    }

    /**
     * Returns the group of libraries at signature
     */
    public SignatureLibraryAccessors getSignature() {
        return laccForSignatureLibraryAccessors;
    }

    /**
     * Returns the group of libraries at squareup
     */
    public SquareupLibraryAccessors getSquareup() {
        return laccForSquareupLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxEspressoLibraryAccessors laccForAndroidxEspressoLibraryAccessors = new AndroidxEspressoLibraryAccessors(owner);
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotation (androidx.annotation:annotation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotation() {
                return create("androidx.annotation");
        }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() {
                return create("androidx.junit");
        }

        /**
         * Returns the group of libraries at androidx.espresso
         */
        public AndroidxEspressoLibraryAccessors getEspresso() {
            return laccForAndroidxEspressoLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.test
         */
        public AndroidxTestLibraryAccessors getTest() {
            return laccForAndroidxTestLibraryAccessors;
        }

    }

    public static class AndroidxEspressoLibraryAccessors extends SubDependencyFactory {

        public AndroidxEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.espresso.core");
        }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runner (androidx.test:runner)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRunner() {
                return create("androidx.test.runner");
        }

    }

    public static class AnimalsnifferLibraryAccessors extends SubDependencyFactory {

        public AnimalsnifferLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (org.codehaus.mojo:animal-sniffer-annotations)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() {
                return create("animalsniffer.annotations");
        }

    }

    public static class AquteLibraryAccessors extends SubDependencyFactory {

        public AquteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for resolve (biz.aQute.bnd:biz.aQute.resolve)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getResolve() {
                return create("aqute.resolve");
        }

    }

    public static class AssertjLibraryAccessors extends SubDependencyFactory {

        public AssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.assertj:assertj-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("assertj.core");
        }

    }

    public static class BouncycastleLibraryAccessors extends SubDependencyFactory {

        public BouncycastleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bcpkix (org.bouncycastle:bcpkix-jdk15to18)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBcpkix() {
                return create("bouncycastle.bcpkix");
        }

            /**
             * Creates a dependency provider for bcprov (org.bouncycastle:bcprov-jdk15to18)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBcprov() {
                return create("bouncycastle.bcprov");
        }

            /**
             * Creates a dependency provider for bctls (org.bouncycastle:bctls-jdk15to18)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBctls() {
                return create("bouncycastle.bctls");
        }

    }

    public static class BrotliLibraryAccessors extends SubDependencyFactory {

        public BrotliLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dec (org.brotli:dec)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDec() {
                return create("brotli.dec");
        }

    }

    public static class CodehausLibraryAccessors extends SubDependencyFactory {
        private final CodehausSignatureLibraryAccessors laccForCodehausSignatureLibraryAccessors = new CodehausSignatureLibraryAccessors(owner);

        public CodehausLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at codehaus.signature
         */
        public CodehausSignatureLibraryAccessors getSignature() {
            return laccForCodehausSignatureLibraryAccessors;
        }

    }

    public static class CodehausSignatureLibraryAccessors extends SubDependencyFactory {

        public CodehausSignatureLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for java18 (org.codehaus.mojo.signature:java18)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJava18() {
                return create("codehaus.signature.java18");
        }

    }

    public static class ConscryptLibraryAccessors extends SubDependencyFactory {

        public ConscryptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.conscrypt:conscrypt-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("conscrypt.android");
        }

            /**
             * Creates a dependency provider for openjdk (org.conscrypt:conscrypt-openjdk-uber)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOpenjdk() {
                return create("conscrypt.openjdk");
        }

    }

    public static class FindbugsLibraryAccessors extends SubDependencyFactory {

        public FindbugsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jsr305 (com.google.code.findbugs:jsr305)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJsr305() {
                return create("findbugs.jsr305");
        }

    }

    public static class GradlePluginLibraryAccessors extends SubDependencyFactory {

        public GradlePluginLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.android.tools.build:gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("gradlePlugin.android");
        }

            /**
             * Creates a dependency provider for androidJunit5 (de.mannodermaus.gradle.plugins:android-junit5)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroidJunit5() {
                return create("gradlePlugin.androidJunit5");
        }

            /**
             * Creates a dependency provider for animalsniffer (ru.vyarus:gradle-animalsniffer-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnimalsniffer() {
                return create("gradlePlugin.animalsniffer");
        }

            /**
             * Creates a dependency provider for binaryCompatibilityValidator (org.jetbrains.kotlinx.binary-compatibility-validator:org.jetbrains.kotlinx.binary-compatibility-validator.gradle.plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBinaryCompatibilityValidator() {
                return create("gradlePlugin.binaryCompatibilityValidator");
        }

            /**
             * Creates a dependency provider for bnd (biz.aQute.bnd:biz.aQute.bnd.gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBnd() {
                return create("gradlePlugin.bnd");
        }

            /**
             * Creates a dependency provider for dokka (org.jetbrains.dokka:dokka-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDokka() {
                return create("gradlePlugin.dokka");
        }

            /**
             * Creates a dependency provider for errorprone (net.ltgt.gradle:gradle-errorprone-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getErrorprone() {
                return create("gradlePlugin.errorprone");
        }

            /**
             * Creates a dependency provider for graal (com.palantir.graal:gradle-graal)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGraal() {
                return create("gradlePlugin.graal");
        }

            /**
             * Creates a dependency provider for kotlin (org.jetbrains.kotlin:kotlin-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlin() {
                return create("gradlePlugin.kotlin");
        }

            /**
             * Creates a dependency provider for kotlinSerialization (org.jetbrains.kotlin:kotlin-serialization)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlinSerialization() {
                return create("gradlePlugin.kotlinSerialization");
        }

            /**
             * Creates a dependency provider for mavenPublish (com.vanniktech:gradle-maven-publish-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMavenPublish() {
                return create("gradlePlugin.mavenPublish");
        }

            /**
             * Creates a dependency provider for shadow (gradle.plugin.com.github.johnrengelman:shadow)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getShadow() {
                return create("gradlePlugin.shadow");
        }

            /**
             * Creates a dependency provider for spotless (com.diffplug.spotless:spotless-plugin-gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSpotless() {
                return create("gradlePlugin.spotless");
        }

    }

    public static class GuavaLibraryAccessors extends SubDependencyFactory {

        public GuavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jre (com.google.guava:guava)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJre() {
                return create("guava.jre");
        }

    }

    public static class JnrLibraryAccessors extends SubDependencyFactory {

        public JnrLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for unixsocket (com.github.jnr:jnr-unixsocket)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUnixsocket() {
                return create("jnr.unixsocket");
        }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final JunitJupiterLibraryAccessors laccForJunitJupiterLibraryAccessors = new JunitJupiterLibraryAccessors(owner);
        private final JunitPlatformLibraryAccessors laccForJunitPlatformLibraryAccessors = new JunitPlatformLibraryAccessors(owner);
        private final JunitVintageLibraryAccessors laccForJunitVintageLibraryAccessors = new JunitVintageLibraryAccessors(owner);

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (junit:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("junit");
        }

            /**
             * Creates a dependency provider for ktx (androidx.test.ext:junit-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("junit.ktx");
        }

            /**
             * Creates a dependency provider for pioneer (org.junit-pioneer:junit-pioneer)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPioneer() {
                return create("junit.pioneer");
        }

        /**
         * Returns the group of libraries at junit.jupiter
         */
        public JunitJupiterLibraryAccessors getJupiter() {
            return laccForJunitJupiterLibraryAccessors;
        }

        /**
         * Returns the group of libraries at junit.platform
         */
        public JunitPlatformLibraryAccessors getPlatform() {
            return laccForJunitPlatformLibraryAccessors;
        }

        /**
         * Returns the group of libraries at junit.vintage
         */
        public JunitVintageLibraryAccessors getVintage() {
            return laccForJunitVintageLibraryAccessors;
        }

    }

    public static class JunitJupiterLibraryAccessors extends SubDependencyFactory {

        public JunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.junit.jupiter:junit-jupiter-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("junit.jupiter.api");
        }

            /**
             * Creates a dependency provider for engine (org.junit.jupiter:junit-jupiter-engine)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() {
                return create("junit.jupiter.engine");
        }

            /**
             * Creates a dependency provider for params (org.junit.jupiter:junit-jupiter-params)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getParams() {
                return create("junit.jupiter.params");
        }

    }

    public static class JunitPlatformLibraryAccessors extends SubDependencyFactory {

        public JunitPlatformLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for console (org.junit.platform:junit-platform-console)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConsole() {
                return create("junit.platform.console");
        }

    }

    public static class JunitVintageLibraryAccessors extends SubDependencyFactory {

        public JunitVintageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for engine (org.junit.vintage:junit-vintage-engine)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() {
                return create("junit.vintage.engine");
        }

    }

    public static class Junit5androidLibraryAccessors extends SubDependencyFactory {

        public Junit5androidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (de.mannodermaus.junit5:android-test-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("junit5android.core");
        }

            /**
             * Creates a dependency provider for runner (de.mannodermaus.junit5:android-test-runner)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRunner() {
                return create("junit5android.runner");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {
        private final KotlinStdlibLibraryAccessors laccForKotlinStdlibLibraryAccessors = new KotlinStdlibLibraryAccessors(owner);
        private final KotlinTestLibraryAccessors laccForKotlinTestLibraryAccessors = new KotlinTestLibraryAccessors(owner);

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit5 (org.jetbrains.kotlin:kotlin-test-junit5)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit5() {
                return create("kotlin.junit5");
        }

            /**
             * Creates a dependency provider for reflect (org.jetbrains.kotlin:kotlin-reflect)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getReflect() {
                return create("kotlin.reflect");
        }

        /**
         * Returns the group of libraries at kotlin.stdlib
         */
        public KotlinStdlibLibraryAccessors getStdlib() {
            return laccForKotlinStdlibLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotlin.test
         */
        public KotlinTestLibraryAccessors getTest() {
            return laccForKotlinTestLibraryAccessors;
        }

    }

    public static class KotlinStdlibLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KotlinStdlibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stdlib (org.jetbrains.kotlin:kotlin-stdlib)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("kotlin.stdlib");
        }

            /**
             * Creates a dependency provider for osgi (org.jetbrains.kotlin:kotlin-osgi-bundle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOsgi() {
                return create("kotlin.stdlib.osgi");
        }

    }

    public static class KotlinTestLibraryAccessors extends SubDependencyFactory {

        public KotlinTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (org.jetbrains.kotlin:kotlin-test-annotations-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() {
                return create("kotlin.test.annotations");
        }

            /**
             * Creates a dependency provider for common (org.jetbrains.kotlin:kotlin-test-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() {
                return create("kotlin.test.common");
        }

            /**
             * Creates a dependency provider for js (org.jetbrains.kotlin:kotlin-test-js)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJs() {
                return create("kotlin.test.js");
        }

            /**
             * Creates a dependency provider for junit (org.jetbrains.kotlin:kotlin-test-junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() {
                return create("kotlin.test.junit");
        }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() {
            return laccForKotlinxCoroutinesLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotlinx.serialization
         */
        public KotlinxSerializationLibraryAccessors getSerialization() {
            return laccForKotlinxSerializationLibraryAccessors;
        }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotlinx.coroutines.core");
        }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() {
                return create("kotlinx.coroutines.test");
        }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-serialization-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotlinx.serialization.core");
        }

            /**
             * Creates a dependency provider for json (org.jetbrains.kotlinx:kotlinx-serialization-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() {
                return create("kotlinx.serialization.json");
        }

    }

    public static class PlayservicesLibraryAccessors extends SubDependencyFactory {

        public PlayservicesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for safetynet (com.google.android.gms:play-services-safetynet)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSafetynet() {
                return create("playservices.safetynet");
        }

    }

    public static class RobolectricLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public RobolectricLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for robolectric (org.robolectric:robolectric)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("robolectric");
        }

            /**
             * Creates a dependency provider for android (org.robolectric:android-all)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("robolectric.android");
        }

    }

    public static class SignatureLibraryAccessors extends SubDependencyFactory {
        private final SignatureAndroidLibraryAccessors laccForSignatureAndroidLibraryAccessors = new SignatureAndroidLibraryAccessors(owner);

        public SignatureLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at signature.android
         */
        public SignatureAndroidLibraryAccessors getAndroid() {
            return laccForSignatureAndroidLibraryAccessors;
        }

    }

    public static class SignatureAndroidLibraryAccessors extends SubDependencyFactory {

        public SignatureAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for apilevel21 (net.sf.androidscents.signature:android-api-level-21)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApilevel21() {
                return create("signature.android.apilevel21");
        }

            /**
             * Creates a dependency provider for apilevel24 (net.sf.androidscents.signature:android-api-level-24)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApilevel24() {
                return create("signature.android.apilevel24");
        }

    }

    public static class SquareupLibraryAccessors extends SubDependencyFactory {
        private final SquareupMoshiLibraryAccessors laccForSquareupMoshiLibraryAccessors = new SquareupMoshiLibraryAccessors(owner);
        private final SquareupOkhttpLibraryAccessors laccForSquareupOkhttpLibraryAccessors = new SquareupOkhttpLibraryAccessors(owner);
        private final SquareupOkioLibraryAccessors laccForSquareupOkioLibraryAccessors = new SquareupOkioLibraryAccessors(owner);

        public SquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for kotlinPoet (com.squareup:kotlinpoet)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlinPoet() {
                return create("squareup.kotlinPoet");
        }

        /**
         * Returns the group of libraries at squareup.moshi
         */
        public SquareupMoshiLibraryAccessors getMoshi() {
            return laccForSquareupMoshiLibraryAccessors;
        }

        /**
         * Returns the group of libraries at squareup.okhttp
         */
        public SquareupOkhttpLibraryAccessors getOkhttp() {
            return laccForSquareupOkhttpLibraryAccessors;
        }

        /**
         * Returns the group of libraries at squareup.okio
         */
        public SquareupOkioLibraryAccessors getOkio() {
            return laccForSquareupOkioLibraryAccessors;
        }

    }

    public static class SquareupMoshiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public SquareupMoshiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for moshi (com.squareup.moshi:moshi)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("squareup.moshi");
        }

            /**
             * Creates a dependency provider for compiler (com.squareup.moshi:moshi-kotlin-codegen)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("squareup.moshi.compiler");
        }

            /**
             * Creates a dependency provider for kotlin (com.squareup.moshi:moshi-kotlin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlin() {
                return create("squareup.moshi.kotlin");
        }

    }

    public static class SquareupOkhttpLibraryAccessors extends SubDependencyFactory {

        public SquareupOkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for icu (com.squareup.okhttpicu:okhttp-icu)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIcu() {
                return create("squareup.okhttp.icu");
        }

    }

    public static class SquareupOkioLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public SquareupOkioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okio (com.squareup.okio:okio)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("squareup.okio");
        }

            /**
             * Creates a dependency provider for fakefilesystem (com.squareup.okio:okio-fakefilesystem)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFakefilesystem() {
                return create("squareup.okio.fakefilesystem");
        }

            /**
             * Creates a dependency provider for nodefilesystem (com.squareup.okio:okio-nodefilesystem)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNodefilesystem() {
                return create("squareup.okio.nodefilesystem");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final BizVersionAccessors vaccForBizVersionAccessors = new BizVersionAccessors(providers, config);
        private final ComVersionAccessors vaccForComVersionAccessors = new ComVersionAccessors(providers, config);
        private final DeVersionAccessors vaccForDeVersionAccessors = new DeVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: checkStyle (10.12.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCheckStyle() { return getVersion("checkStyle"); }

            /**
             * Returns the version associated to this alias: graalvm (22.3.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGraalvm() { return getVersion("graalvm"); }

        /**
         * Returns the group of versions at versions.biz
         */
        public BizVersionAccessors getBiz() {
            return vaccForBizVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.com
         */
        public ComVersionAccessors getCom() {
            return vaccForComVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.de
         */
        public DeVersionAccessors getDe() {
            return vaccForDeVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() {
            return vaccForKotlinxVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

    }

    public static class BizVersionAccessors extends VersionFactory  {

        private final BizAQuteVersionAccessors vaccForBizAQuteVersionAccessors = new BizAQuteVersionAccessors(providers, config);
        public BizVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.biz.aQute
         */
        public BizAQuteVersionAccessors getAQute() {
            return vaccForBizAQuteVersionAccessors;
        }

    }

    public static class BizAQuteVersionAccessors extends VersionFactory  {

        public BizAQuteVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: biz.aQute.bnd (6.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBnd() { return getVersion("biz.aQute.bnd"); }

    }

    public static class ComVersionAccessors extends VersionFactory  {

        private final ComSquareupVersionAccessors vaccForComSquareupVersionAccessors = new ComSquareupVersionAccessors(providers, config);
        public ComVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.squareup
         */
        public ComSquareupVersionAccessors getSquareup() {
            return vaccForComSquareupVersionAccessors;
        }

    }

    public static class ComSquareupVersionAccessors extends VersionFactory  {

        public ComSquareupVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: com.squareup.moshi (1.15.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMoshi() { return getVersion("com.squareup.moshi"); }

            /**
             * Returns the version associated to this alias: com.squareup.okio (3.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkio() { return getVersion("com.squareup.okio"); }

    }

    public static class DeVersionAccessors extends VersionFactory  {

        private final DeMannodermausVersionAccessors vaccForDeMannodermausVersionAccessors = new DeMannodermausVersionAccessors(providers, config);
        public DeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.de.mannodermaus
         */
        public DeMannodermausVersionAccessors getMannodermaus() {
            return vaccForDeMannodermausVersionAccessors;
        }

    }

    public static class DeMannodermausVersionAccessors extends VersionFactory  {

        public DeMannodermausVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: de.mannodermaus.junit5 (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit5() { return getVersion("de.mannodermaus.junit5"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.serialization (1.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSerialization() { return getVersion("kotlinx.serialization"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgJetbrainsVersionAccessors vaccForOrgJetbrainsVersionAccessors = new OrgJetbrainsVersionAccessors(providers, config);
        private final OrgJunitVersionAccessors vaccForOrgJunitVersionAccessors = new OrgJunitVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.bouncycastle (1.76)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBouncycastle() { return getVersion("org.bouncycastle"); }

            /**
             * Returns the version associated to this alias: org.conscrypt (2.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getConscrypt() { return getVersion("org.conscrypt"); }

        /**
         * Returns the group of versions at versions.org.jetbrains
         */
        public OrgJetbrainsVersionAccessors getJetbrains() {
            return vaccForOrgJetbrainsVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.junit
         */
        public OrgJunitVersionAccessors getJunit() {
            return vaccForOrgJunitVersionAccessors;
        }

    }

    public static class OrgJetbrainsVersionAccessors extends VersionFactory  {

        public OrgJetbrainsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.jetbrains.coroutines (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("org.jetbrains.coroutines"); }

            /**
             * Returns the version associated to this alias: org.jetbrains.kotlin (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("org.jetbrains.kotlin"); }

    }

    public static class OrgJunitVersionAccessors extends VersionFactory  {

        public OrgJunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.junit.jupiter (5.10.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJupiter() { return getVersion("org.junit.jupiter"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
