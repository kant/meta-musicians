SUMMARY = "Digital Peak Limiter LV2 Plugin"
HOMEPAGE = "https://x42-plugins.com/x42/x42-limiter"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"

inherit pkgconfig

DEPENDS += " \
    libglu \
    cairo \
    pango \
    lv2 \
    jack \
"

SRC_URI = "gitsm://github.com/x42/dpl.lv2.git"
SRCREV = "67593cd22f531879f9461ce022cb564b0d3ab173"
PV = "0.5.1"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += " \
    STRIP=echo \
    OPTIMIZATIONS= \
"

do_install() {
    oe_runmake DESTDIR=${D} PREFIX=${prefix} LV2DIR=${libdir}/lv2 install
}

FILES_${PN} += "${libdir}/lv2"
