/*
 * Created by Be lee on 2023/03/19
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by backend Team <bd_lee@bigin.io>, 2023/03/19
 */
package com.example.basicsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create on 2023/03/19. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author Bd Lee
 * @version 1.0
 * @since 1.0
 */
@RestController
public class SecurityController {

  @GetMapping("/")
  public String index() {
    return "home";
  }
}
