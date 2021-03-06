package qa_guru.practices.lesson_23.practice.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    public static boolean isWebMobile() {
        return !config.browserMobileView().equals("");
    }

    public static boolean isRemoteWebDriver() {
        return !config.remote().equals("");
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }
}
