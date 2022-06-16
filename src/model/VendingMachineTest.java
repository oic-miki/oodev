package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachineTest {
	
	private VendingMachine vendingMachine = new VendingMachine();
	
	@Test
	void test01() {
		
		// レーン1にジュースを10本追加
		for (int count = 0; count < 10; count++) {
			
			vendingMachine.addDrink(1, new Drink("オレンジジュース", 120));
			
		}
		
		// 自販機に500円を投入
		vendingMachine.addMoney(500);
		
		// 自販機の投入額は500
		assertEquals(500, vendingMachine.getMoney());
		
		// レーン1の商品ボタンが点灯していたらボタンを押下
		if (vendingMachine.isLightOn(1)) {
			
			// 購入
			assertEquals("オレンジジュース", vendingMachine.pushButton(1).getName());
			
		}
		
		// 返金
		assertEquals(380, vendingMachine.refund());
		
		// 自販機の投入額はゼロ
		assertEquals(0, vendingMachine.getMoney());
		
	}

	@Test
	void test02() {
		
		// 自販機に200円を投入
		vendingMachine.addMoney(200);
		
		// 自販機の投入額は200
		assertEquals(200, vendingMachine.getMoney());
		
		// 返金
		assertEquals(200, vendingMachine.refund());
		
		// 自販機の投入額はゼロ
		assertEquals(0, vendingMachine.getMoney());
		
	}

}
