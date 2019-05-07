package org.testmonkeys.maui.driverfactory;


public class BrowserStackConfig {

    private BrowserStackAuth auth;
    private String browser;
    private String os;
    private String seleniumVersion;
    private boolean local;
    private String localIdentifierVar;
    private String osVersion;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getSeleniumVersion() {
        return seleniumVersion;
    }

    public void setSeleniumVersion(String seleniumVersion) {
        this.seleniumVersion = seleniumVersion;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public BrowserStackAuth getAuth() {
        return auth;
    }

    public void setAuth(BrowserStackAuth auth) {
        this.auth = auth;
    }

    public String getLocalIdentifierVar() {
        return localIdentifierVar;
    }

    public void setLocalIdentifierVar(String localIdentifierVar) {
        this.localIdentifierVar = localIdentifierVar;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}
