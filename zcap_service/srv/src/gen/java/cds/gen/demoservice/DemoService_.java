package cds.gen.demoservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2025-05-15T07:24:58.264510100Z",
    comments = "com.sap.cds:cds-maven-plugin:3.10.0 / com.sap.cds:cds4j-api:3.10.0"
)
@CdsName("DemoService")
public interface DemoService_ {
  String CDS_NAME = "DemoService";

  Class<DemoEntity_> DEMO_ENTITY = DemoEntity_.class;
}
