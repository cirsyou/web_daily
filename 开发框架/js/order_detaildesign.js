'use strict'
$(function () {
  // 深化设计阶段状态切换
  let deepenFlag = 0
  $('#btnDeepennext').click(function () {
    deepenFlag++
    console.log(deepenFlag)
    if (deepenFlag >= 3) {
      deepenFlag = 3
      return false
    }
    if (deepenFlag >= 1) {
      $('#deepenDesign').hide()
    }
    if (deepenFlag >= 2) {
      $('#deepenDesign').hide()
      $('.deepdesigndraft').removeClass('none')
    }
    // 进度条的变化
    $('.od-deschedulenav').children('div').removeClass('od-menucurrent')
    $('.od-deschedulenav').children('div').eq(deepenFlag).addClass('od-menucurrent')
    // 状态的变化
    $('.deepenDesign').children('div.od-newstatusbox').removeClass('current-status')
    $('.deepenDesign').children('div.od-newstatusbox').eq(deepenFlag).addClass('current-status')
  })
})
