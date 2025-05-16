package cds.gen.demoservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("DemoService.DemoEntity")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-05-15T07:24:58.264510100Z",
    comments = "com.sap.cds:cds-maven-plugin:3.10.0 / com.sap.cds:cds4j-api:3.10.0"
)
public interface DemoEntity extends CdsData {
  String ID = "ID";

  String TITLE = "title";

  String DESCR = "descr";

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  String getTitle();

  void setTitle(String title);

  String getDescr();

  void setDescr(String descr);

  DemoEntity_ ref();

  static DemoEntity create() {
    return Struct.create(DemoEntity.class);
  }

  static DemoEntity of(Map<String, Object> map) {
    return Struct.access(map).as(DemoEntity.class);
  }

  static DemoEntity create(Integer id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(DemoEntity.class);
  }
}
