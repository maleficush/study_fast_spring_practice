import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	@Test
	void main() {
		// [ Given ]
		String[] args = {"3", "2", "1"};

		// [ when & Then]
		Main.main(args);

	}
}