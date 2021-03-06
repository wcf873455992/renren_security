package io.renrenapi.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renrenapi.entity.RoomEntity;
import io.renrenapi.service.RoomService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author wcf
 * @email 873455992@qq.com
 * @date 2019-06-25 15:31:08
 */

@CrossOrigin
@RestController
@RequestMapping("api/room")
@Api(tags = "房间管理")
public class RoomController {
    @Autowired
    private RoomService roomService;

    /**
     * 列表
     */
    @CrossOrigin
    @RequestMapping("/list")
    @ApiOperation(value = "列表",httpMethod = "POST")
//    @ApiOperation(value = "列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = roomService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @CrossOrigin
    @RequestMapping("/info/{roomId}")
    @ApiOperation(value = "房间信息",httpMethod = "POST")
//    @ApiOperation(value = "房间信息")
    public R info(@PathVariable("roomId") Integer roomId){
        RoomEntity room = roomService.getById(roomId);

        return R.ok().put("room", room);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RoomEntity room){
        roomService.save(room);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RoomEntity room){
        ValidatorUtils.validateEntity(room);
        roomService.updateById(room);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] roomIds){
        roomService.removeByIds(Arrays.asList(roomIds));

        return R.ok();
    }

}
