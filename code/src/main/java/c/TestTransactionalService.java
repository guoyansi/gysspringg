package c;


@TransactionalService(transactionManager = "txManager3")
public class TestTransactionalService {

    public void save(){
        System.out.println("保存操作...");
    }
}
