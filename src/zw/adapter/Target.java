package zw.adapter;

//�ͻ����ڴ��Ľӿ�
public interface Target {
	default void request() {
		System.out.println("��ͨ����");
	}
}
