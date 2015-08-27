import junit.framework.Test;
import junit.framework.TestSuite;

public class Testev {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(test-environment.class);
    suite.addTestSuite(test-variables-dev.class);
    suite.addTestSuite(test-variables-uat.class);
    suite.addTestSuite(test-variables-prod.class);
    suite.addTestSuite(test-variables.class);
    suite.addTestSuite(ldap-user-groups-and-permissions--LDAP-integration.class);
    suite.addTestSuite(ldap-user-groups-and-permissions--ui-restrictions-regular-user.class);
    suite.addTestSuite(ldap-user-groups-and-permissions--asset-permissions.class);
    suite.addTestSuite(ldap-performance--caching-configuration.class);
    suite.addTestSuite(ldap-performance--page-function-latency.class);
    suite.addTestSuite(ldap-performance--ldap-lookup-latency.class);
    suite.addTestSuite(metadata--schemas.class);
    suite.addTestSuite(metadata--services-facilities-schema.class);
    suite.addTestSuite(metadata--campus-schema.class);
    suite.addTestSuite(metadata--content-tool-authoring.class);
    suite.addTestSuite(basic-content-authoring.class);
    suite.addTestSuite(easy-edit-suite--basic-features.class);
    suite.addTestSuite(easy-edit-suite--basic-features-regular-user.class);
    suite.addTestSuite(easy-edit-suite--basic-editing.class);
    suite.addTestSuite(easy-edit-suite--basic-editing-regular-user.class);
    suite.addTestSuite(easy-edit-suite--create-new-page.class);
    suite.addTestSuite(easy-edit-suite--create-new-page-regular-user.class);
    suite.addTestSuite(content-tools--add-content-tool-button.class);
    suite.addTestSuite(content-tools--lead-text-tool.class);
    suite.addTestSuite(content-tools--content-section-tool.class);
    suite.addTestSuite(content-tools--content-section-tool-wells.class);
    suite.addTestSuite(content-tools--tabs-tool.class);
    suite.addTestSuite(content-tools--tabs-tool-tab-panels.class);
    suite.addTestSuite(workflow--basic-workflow-reject.class);
    suite.addTestSuite(workflow--basic-workflow-approve.class);
    suite.addTestSuite(workflow--review-dates.class);
    suite.addTestSuite(workflow--basic-workflow-self-approve.class);
    suite.addTestSuite(workflow--basic-workflow-nested-approver-group.class);
    suite.addTestSuite(workflow--content-tools-workflow-approve.class);
    suite.addTestSuite(deakin-sync--link-page-available.class);
    suite.addTestSuite(deakin-sync--integration-service.class);
    suite.addTestSuite(watson--curation-resource-availability.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
