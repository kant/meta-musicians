SUMMARY = "Rosegarden is a music composition and editing environment"
HOMEPAGE = "http://www.rosegardenmusic.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b33ec9f109e9943af917779ba6ec522e"

DEPENDS += " \
    qttools-native \
    qtbase \
    qtx11extras \
    virtual/libx11 \
    jack \
    dssi \
    zlib \
    lrdf \
"

inherit cmake_qt5 pkgconfig gtk-icon-cache features_check mime mime-xdg

REQUIRED_DISTRO_FEATURES = "x11"

PV = "21.06"
SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[sha256sum] = "cde4fde48d01024a03bd7a96f63f9c6e7324728214183ceb605018f89faf0b66"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/metainfo \
"
