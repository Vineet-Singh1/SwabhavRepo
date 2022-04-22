package com.monocept.model.test;

import java.util.List;
import com.monocept.model.Builder;
import com.monocept.model.InstrumentSpec;
import com.monocept.model.Inventory;
import com.monocept.model.Mandolin;
import com.monocept.model.MandolinSpec;
import com.monocept.model.Style;
import com.monocept.model.Type;
import com.monocept.model.Wood;

public class InventoryTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		MandolinSpec mandoloinSpec = new MandolinSpec(Builder.FENDER, "rock", Type.ACCOUSTIC, Style.A, Wood.ADIRONDACK,
				Wood.ALDER);
		Mandolin mandolin = new Mandolin("122", 5000, mandoloinSpec);
		inventory.addInstrument("102", 5000, mandoloinSpec);
		List<Mandolin> mandolins = inventory.search(mandoloinSpec);
		System.out.println("List of all seacrh items");
		printDetails(mandolins);

	}

	private static void printDetails(List<Mandolin> mandolins) {
		for (Mandolin mand : mandolins) {
			System.out.println(mand.getSerialNumber());
			System.out.println(mand.getPrice());
			InstrumentSpec instrument = mand.getSpec();
			System.out.println(instrument.getModel());
			System.out.println(instrument.getBackWood());
			System.out.println(instrument.getTopWood());
			System.out.println(instrument.getType());
		}
	}
}
