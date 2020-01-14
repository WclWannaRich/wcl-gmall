package com.wcl.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcl.gmall.pms.entity.AlbumPic;
import com.wcl.gmall.pms.mapper.AlbumPicMapper;
import com.wcl.gmall.pms.service.AlbumPicService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-12
 */
@Service
@Component
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
