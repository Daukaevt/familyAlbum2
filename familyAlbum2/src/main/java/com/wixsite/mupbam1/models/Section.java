package com.wixsite.mupbam1.models;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Section {
	@Id
	private int id;
	private String name;
	private String imgPath;

}
