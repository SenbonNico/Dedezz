package com.zz.Controller

@RestController
class ComputerController {
    @Resource
    internal var cservice: ComputerService? = null

    @RequestMapping("addc")
    fun add(): String {
        val c = Computer()
        c.setName("asda")
        c.setPrice(17000)
        cservice!!.save(c)
        return "asda"
    }
}