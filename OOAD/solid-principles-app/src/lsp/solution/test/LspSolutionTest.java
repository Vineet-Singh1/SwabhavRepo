package lsp.solution.test;

import lsp.solution.Rectangle;
import lsp.solution.Square;

public class LspSolutionTest {

	public static void main(String[] args) {
		shouldNotChangedWidthIfHeightIsChangedFor(new Rectangle(10, 20));
		// shouldNotChangedWidthIfHeightIsChangedFor(new Square(30));

	}

	public static void shouldNotChangedWidthIfHeightIsChangedFor(Rectangle rectangle) {
		double before = rectangle.getWidth();
		rectangle.setHeight(rectangle.getHeight() + 10);
		double after = rectangle.getWidth();
		System.out.println(before == after);
		System.out.println(after);

	}

}
