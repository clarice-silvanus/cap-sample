package cds.gen.demoservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("DemoService.DemoEntity")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-05-15T07:24:58.264510100Z",
    comments = "com.sap.cds:cds-maven-plugin:3.10.0 / com.sap.cds:cds4j-api:3.10.0"
)
public interface DemoEntity_ extends StructuredType<DemoEntity_> {
  String ID = "ID";

  String CDS_NAME = "DemoService.DemoEntity";

  @CdsName(ID)
  ElementRef<Integer> ID();

  ElementRef<String> title();

  ElementRef<String> descr();
}
