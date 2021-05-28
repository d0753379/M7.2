public class Swimming_pool {
	int price;
	boolean holiday;
	boolean member;
	boolean group;
	int hour;
	int min;
	int age;

	public Swimming_pool(boolean holiday, boolean member, boolean group, int hour, int min, int age) {
		this.price = -1;
		this.holiday = holiday;
		this.member = member;
		this.group = group;
		this.hour = hour;
		this.min = min;
		this.age = age;
	}

	public void countPrice() throws Exception {
		if (check()) {
		} else {
			throw new Exception("Error");
		}

		if (holiday) {
			if (member == true) {
				price = 125;
			} else {
				price = 250;
			}
		} else {
			if (member == true) {
				price = 100;
			} else {
				if (group == true) {
					price = 140;
				} else {
					if (countTime() == true || countAge() == true) {
						price = 160;
					} else {
						price = 200;
					}
				}
			}
		}
	}

	boolean check() {
		if (age < 3 || age > 75) {
			return false;
		}
		return true;
	}

	boolean countTime() {
		if (hour < 7 || hour == 7 && min == 0) {
			return true;
		}

		return false;
	}

	boolean countAge() {
		if (age <= 12 || 60 <= age) {
			return true;
		}
		return false;
	}
}
