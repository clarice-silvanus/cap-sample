package cds.gen.demoservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2025-05-15T07:24:58.264510100Z",
    comments = "com.sap.cds:cds-maven-plugin:3.10.0 / com.sap.cds:cds4j-api:3.10.0"
)
@CdsName(DemoService_.CDS_NAME)
public interface DemoService extends CqnService {
  interface Application extends ApplicationService, DemoService {
  }

  interface Remote extends RemoteService, DemoService {
  }
}
